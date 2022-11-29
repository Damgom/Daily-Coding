public class MakeStrangeString {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
    public static String solution(String s) {
        int count = 0;
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                count = 0;
                answer += ch;
            }else if (count % 2 == 0) {
                answer += (Character.toUpperCase(ch));
                count++;
            }else {
                answer += (Character.toLowerCase(ch));
                count++;
            }
        }
        return answer;
    }
}