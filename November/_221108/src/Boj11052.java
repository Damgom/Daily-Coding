import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11052 {
    public static void main(String[] args) throws IOException {
        /*
        dp 문제
        bottom-up, 카드 4장을 살 때 dp[4] + card[0] dp[3] + card[1]
        dp[2] + card[2], dp[1] + card[3], dp[0] + card[4]
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] card = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + card[j]);
            }
        }
        System.out.println(dp[n]);
    }
}

    /*
    재귀를 이용한 풀이 근데 실패뜸
     */
//    private static int getMaxValue(int n, int[] card) {
//        double max = Integer.MIN_VALUE;
//        int maxIndex = 0;
//        double[] temp = new double[n +1];
//        for(int i = 1; i <= n; i++) {
//            temp[i] = card[i] / i;
//            if(temp[i] > max) {
//                max = temp[i];
//                maxIndex = i;
//            }
//        }
//        int result = 0;
//        if(n % maxIndex == 0) {
//            result = card[maxIndex] * (n / maxIndex);
//        }else {
//            result = card[maxIndex] * (n / maxIndex);
//            n %= maxIndex;
//            result += getMaxValue(n, card);
//        }
//        return result;
//    }