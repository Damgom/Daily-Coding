public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(solution("AB", 14));
    }
    public static String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(s.charAt(i) == ' ') {
                answer += ch;
            }
            else {
                if(ch >= 'a' && ch <= 'z') {
                    if(ch + n > 'z') {
                        answer += (char)(ch-26+n);
                    }else {
                        answer += (char)(ch+n);
                    }
                }else {
                    if(ch + n > 'Z') {
                        answer += (char)(ch-26+n);
                    }else {
                        answer += (char)(ch+n);
                    }
                }
            }
        }
        return answer;
    }
}