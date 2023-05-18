import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<String> dictionary = new ArrayList<>();
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < str.length(); i++) {
            dictionary.add(i, String.valueOf(str.charAt(i)));
        }
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < msg.length(); i++) {
            queue.add(msg.charAt(i));
        }
        String temp = "";
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty() || !"".equals(temp)) {
            if(dictionary.contains(temp + queue.peek())) {
                temp = temp + queue.poll();
                continue;
            }
            dictionary.add(temp + queue.peek());
            result.add(dictionary.indexOf(temp) + 1);
            temp = "";
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}