public class MiddleWord {
    public static void main(String[] args) {
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        String answer = "";

//        if(s.length() == 0) {
//        }
//        else if (s.length() % 2 == 0) {
//            answer += s.charAt((s.length() / 2) - 1);
//            answer += s.charAt(s.length() / 2);
//        }else answer += s.charAt(s.length() / 2);
//
//        return answer;
        return s.substring((s.length()-1) / 2, s.length()/2 + 1);
    }
}