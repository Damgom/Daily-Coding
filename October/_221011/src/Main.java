import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[1000001];
        /*
         * N = 1 -> 1
         * N = 2 -> 00 11
         * N = 3 -> 001 100 111
         * N = 4 -> 0000 0011 1001 1100 1111
         * N = 5 -> 00001 00100 10000 10011 11001 11111 00111 11100
         * 점화식 피보나치
         */
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }
        System.out.println(dp[n]);
    }
}