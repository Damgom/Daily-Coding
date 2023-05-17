import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            return 65536;
        }
        List<String> list1 = parsing(str1.toUpperCase());
        List<String> list2 = parsing(str2.toUpperCase());
        int union = list1.size();
        int intersection = 0;
        for (String s : list2) {
            if (list1.contains(s)) {
                list1.remove(s);
                intersection++;
            }else {
                union++;
            }
        }
        return (int) (((double) intersection / union) * 65536);
    }
    static List<String> parsing(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length()-1; i++) {
            String temp = "";
            boolean flag = true;
            for (int j = i; j <= i+1; j++) {
                char ch = s.charAt(j);
                if (ch >= 'A' && ch <= 'Z') {
                    temp += ch;
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(temp);
            }
        }
        return list;
    }
}