import java.util.Arrays;

public class NumReverseSort {
    public static void main(String[] args) {
        System.out.println(solution(118372));

    }

    public static long solution(long n) {
        long answer = 0;
        String temp = String.valueOf(n);

        String[] arr = temp.split("");
        Arrays.sort(arr);
        StringBuilder result = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--) {
            result.append(arr[i]);
        }
        answer = Long.parseLong(String.valueOf(result));
        return answer;
    }
}