class Solution {
    public String solution(String s, String skip, int index) {
        char[] words = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < index; j++) {
                do {
                    words[i]++;
                    if (words[i] > 'z') {
                        words[i] -= 26;
                    }
                }while (skip.contains(String.valueOf(words[i])));
            }
        }
        return String.valueOf(words);
    }
}