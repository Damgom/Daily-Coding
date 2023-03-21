class Solution {
    public int solution(String t, String p) {
        int count = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String temp = t.substring(i, i + p.length());
            if (Long.parseLong(temp) <= Long.parseLong(p)) {
                count++;
            }
        }
        return count;
    }
}