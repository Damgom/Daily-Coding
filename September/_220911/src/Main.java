import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        //N = 100일 때 int 범위를 벗어남
        long[] dp = new long[101];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        for(int i = 5; i < dp.length; i++){
            dp[i] = dp[i-5] + dp[i-1];
        }
        for(int i = 0; i < T; i++){
            System.out.println(dp[Integer.parseInt(br.readLine())]);
        }
    }
}