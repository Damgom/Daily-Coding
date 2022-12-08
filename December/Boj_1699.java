import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1699 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1699 제곱수의 합, dp
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[100_001];
        /*
        실패코드
         */
//        for(int i = 1; i < Math.sqrt(dp.length); i++) {
//            dp[(int) Math.pow(i, 2)] = 1;
//        }
//        for(int i = 1; i < dp.length; i++) {
//            if (dp[i] == 0) {
//                int num = (int) Math.pow((int)Math.sqrt(i), 2);
//                dp[i] = dp[num] + dp[i - num];
//            }
//        }
//        System.out.println(dp[n]);
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j = 1; j <= i / 2; j++) {
                if(j * j == i) {
                    dp[i] = 1;
                    break;
                }
                dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
            }
        }
        System.out.println(dp[n]);
    }
}