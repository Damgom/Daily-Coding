import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] dp = new int[d+1];
        for (int i = 1; i <= k / 2; i++) {
            for (int j = i + 1; j < k; j++) {
                dp[0] = i;
                dp[1] = j;
                for (int n = 2; n < d; n++) {
                    dp[n] = dp[n-1] + dp[n-2];
                }
                if (dp[d-1] == k) {
                    System.out.println(dp[0]);
                    System.out.println(dp[1]);
                    return;
                }
            }
        }
    }
}