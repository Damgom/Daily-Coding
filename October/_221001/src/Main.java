import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 피보나치문제. 점화식을 찾는것이 중요 타일이 1개일때 4 2개일때 6 3개일때 10 4개일때 16
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[81];
        dp[1] = 4;
        dp[2] = 6;

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}