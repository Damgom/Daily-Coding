class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder temp = new StringBuilder();
        int num = 0;
        while (temp.length() < t * m) {
            String s = Integer.toString(num, n).toUpperCase();
            for (int i = 0; i < s.length(); i++) {
                temp.append(s.charAt(i));
            }
            num++;
        }
        StringBuilder result = new StringBuilder();
        int index = p - 1;
        while (result.length() != t) {
            char ch = temp.charAt(index);
            result.append(ch);
            index += m;
        }
        return result.toString();
    }
}