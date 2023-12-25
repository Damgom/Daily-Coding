import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // fibonacci
        int[][] dp = new int[2][46];
        dp[0][2] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[0][i] = dp[0][i - 2] + dp[0][i - 1];
            dp[1][i] = dp[1][i - 2] + dp[1][i - 1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dp[0][n]).append(" ").append(dp[1][n]);
        System.out.println(sb);
    }
}