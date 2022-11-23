public class StringFilter {
    public static void main(String[] args) {
        System.out.println(solution("118372"));

    }

    public static boolean solution(String s) {
        boolean answer = false;
        if(s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        if(s.matches("^\\d*")) {
            answer = true;
        }
        return answer;
    }
}