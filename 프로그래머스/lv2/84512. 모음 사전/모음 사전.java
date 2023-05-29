import java.util.*;
class Solution {
    static String[] arr = {"A", "E", "I", "O", "U"};
    static List<String> list = new ArrayList<>();
    public int solution(String word) {
        recursion("", 0);
        return list.indexOf(word);
    }
    static void recursion(String temp, int depth) {
        if (depth > 5) {
            return;
        }
        list.add(temp);
        for (String s : arr) {
            recursion(temp + s, depth + 1);
        }
    }
}