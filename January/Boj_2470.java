import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2470 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2470 두 용액
         * @TwoPointer
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int minValue = Integer.MAX_VALUE;
        int start = 0;
        int end = n - 1;
        int num1 = 0;
        int num2 = 0;
        while (end > start) {
            int sum = arr[start] + arr[end];
            int abs = Math.abs(arr[start] + arr[end]);
            if (minValue > abs) {
                minValue = abs;
                num1 = arr[start];
                num2 = arr[end];
            }
            if (sum > 0) {
                end--;
            }else start++;
        }
        System.out.println(num1 + " " + num2);
    }
}