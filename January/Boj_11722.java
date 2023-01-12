import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11722 {
    public static void main(String[] args) throws IOException {
        /*
        boj_11722 가장 긴 감소하는 부분 수열
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n];
        dp[0] = 1;
//        int answer = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j] && dp[j] >= dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
//            answer = Math.max(answer, dp[i]);
        }
//        System.out.println(answer);
        int answer = Integer.MIN_VALUE;
        for (int num : dp) {
            if (num > answer) {
                answer = num;
            }
        }
        System.out.println(answer);
    }
}
