import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 제일 처음 생각했던 코드 greedy
//        int count = 0;
//        while(N != 0){
//            int sqrt = (int) Math.sqrt(N);
//            N -= Math.pow(sqrt, 2);
//            count++;
//            System.out.println(N);
//        }
//        System.out.println(count);
        /*
        1 -> 1^2
        2 -> 1^2 + 1^2
        3 -> 1^2 + 1^2 + 1^2
        4 -> 2^2
        10 -> 3^2 + 1^2
        11 -> 3^2 + 1^2 + 1^2
        12 -> 3^2 + 1^2 + 1^2 + 1^2
        13 -> 3^2 + 2^2
         */
        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= N; i++){
            int min = 50000;

            for(int j = 1; j * j <= i; j++){
                min = Math.min(min, dp[i - j * j]);
            }
            dp[i] = min + 1;
        }
        System.out.println(dp[N]);
    }
}