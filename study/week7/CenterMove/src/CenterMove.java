import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CenterMove {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[16];
        int[] result = new int[16];
        //한변에 찍히는 점의 개수
        dp[0] = 2;
        for(int i = 1; i < 16; i++){
            dp[i] = dp[i-1]+(dp[i-1]-1);
        }
        for(int i = 0; i < 16; i++){
            result[i] = (int) Math.pow(dp[i] , 2);
        }
        System.out.println(result[N]);

    }
}