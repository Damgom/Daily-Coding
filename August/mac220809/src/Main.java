import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //테스트케이스
        int T = Integer.parseInt(br.readLine());

        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i < 11; i++){
            // 손으로 풀어보니 규칙이 나옴
            //dp 4일 때 7
            //dp 5일 때 13
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

//        for(int i = 0; i < 11; i++){
//            System.out.println(dp[i]);
//        }

        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[n]);
        }

    }
}