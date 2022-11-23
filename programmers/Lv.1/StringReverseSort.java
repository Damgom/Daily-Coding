import java.util.Arrays;

public class StringReverseSort {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));

    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split("");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }
        return answer.reverse().toString();
    }
}