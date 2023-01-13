import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11054 {
    public static void main(String[] args) throws IOException {
        /**
         * @boj_11054 가장 긴 바이토닉 부분 수열 
         * @DinamicProgramming
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] left_dp = new int[n];
        left_dp[0] = 1;
        for (int i = 1; i < n; i++) {
            left_dp[i] = 1;
            for (int j = 0; j < i; j++) {
//                if (arr[i] > arr[j]) {
//                    left_dp[i] = Math.max(left_dp[j] + 1, left_dp[i]);
//                }
                if (arr[i] > arr[j] && left_dp[j] >= left_dp[i]) {
                    left_dp[i] = left_dp[j] + 1;
                }
            }
        }
        int[] right_dp = new int[n];
        right_dp[0] = 1;
        int length = arr.length;
        for (int i = 1; i < n; i++) {
            right_dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[length - 1 - i] > arr[length - 1 - j]) {
                    right_dp[i] = Math.max(right_dp[j] + 1, right_dp[i]);
                }
            }
        }
        int max = 1;
        for (int i = 0; i < n; i++) {
            int temp = left_dp[i] + right_dp[length - 1 - i] - 1;
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
