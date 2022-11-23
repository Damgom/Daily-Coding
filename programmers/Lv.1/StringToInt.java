public class StringToInt {
    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }

    public static int solution(String s) {
//        int answer = 0;
//        char first = s.charAt(0);
//
//        int count = 0;
//        String temp = "";
//        for(int i = s.length()-1; i >= 1; i--) {
//            temp += s.charAt(i);
//            answer += Integer.parseInt(temp) * Math.pow(10, count);
//            count++;
//            temp = "";
//        }
//        if(first == '+') {
//            return answer;
//        } else if(first == '-') {
//            answer *= -1;
//            return answer;
//        } else {
//            temp += s.charAt(0);
//            return answer += Integer.parseInt(temp) * Math.pow(10, count);
//        }
        return Integer.parseInt(s);
    }
}