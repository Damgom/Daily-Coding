import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /* 이친수
        1 -> 1 1개
        2 -> 10 1개
        3 -> 100, 101 2개
        4 -> 1000, 1001, 1010 3개
        5 -> 10000, 10001, 10010, 10100, 10101 5개
        점화식 dp[n] = dp[n-1] + dp[n-2]
         */
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
}