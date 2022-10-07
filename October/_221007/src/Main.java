import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        /*
        * n = 3  2 + dp[2] -> 2 + (1 + dp[1]) = 3
        * n = 4  4 + dp[2] + dp[2] -> dp[2]+ 2 = dp[3] 이고 dp[2] = 1 이므로 3 + dp[3]
        * n = 5  6 + dp[3] + dp[2] -> 3 + dp[3] = dp[4] 이고 dp[2] = 1 이므로 4 + dp[4]*/

        for(int i = 3; i <= 10; i++) {
            dp[i] = (i - 1) + dp[i - 1];
        }
        System.out.println(dp[n]);
    }
}