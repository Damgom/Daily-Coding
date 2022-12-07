import java.util.Arrays;

public class RepeatBinaryConversion {
    static int count = 0;
    static int conversion = 1;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("01110")));
    }
    public static int[] solution(String s) {
        String temp = "";
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                temp += s.charAt(i);
            }else count++;
        }
        temp = toBinary(temp);
        if(!temp.equals("1")) {
            solution(temp);
            conversion++;
        }
        return new int[]{conversion, count};
    }

    public static String toBinary(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        while(length >= 2) {
            sb.append(length % 2);
            length /= 2;
        }
        sb.append(length);
        return sb.reverse().toString();
    }
}