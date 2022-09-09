import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /*
        * n = 1 일 때 1
        * n = 2 일 때 3
        * n = 3 일 때 5
        * n = 4 일 때 11
        * 그림을 그려보면 점화식을 구할 수 있다.
        */

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        // dp[2] = 3;
        // dp[2]의 값을 미리 넣어두면 n = 1일때 dp 배열의 길이가 2라 인덱스2가 들어갈수없어서 ArrayIndexOutOfBounds
        // dp[0]의 값은 실제로는 0이 들어와야하지만 n의 범위가 1부터 1000이기 때문에 임의의 수를 넣어도 상관없다
        for(int i = 2; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2] * 2) % 10007;
        }
        System.out.println(dp[n]);
    }
}