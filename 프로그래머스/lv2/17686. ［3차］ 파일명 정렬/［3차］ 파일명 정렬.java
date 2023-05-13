import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {
            if (parseHead(o1).equals(parseHead(o2))) {
                if (parseNum(o1) == parseNum(o2)) {
                    return parseNum(o2) - parseNum(o1);
                }return parseNum(o1) - parseNum(o2);
            }return parseHead(o1).compareTo(parseHead(o2));
        });
        return files;
    }
    static String parseHead(String s) {
        String temp = s.toLowerCase();
        String answer = "";
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (c >= '0' && c <= '9') {
                break;
            }
            answer += c;
        }
        return answer;
    }
    static int parseNum(String s) {
        String temp = "";
        for (int i = parseHead(s).length(); i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                temp += c;
            }else break;
        }
        return Integer.parseInt(temp);
    }
}