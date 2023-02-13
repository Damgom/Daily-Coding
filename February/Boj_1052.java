import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1052 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_1052 물병
         * @greedy
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int buyBottle = 0;
        while (true) {
            int temp = n + buyBottle;
            int count = 0;
            while (temp > 0) {
                if (temp % 2 != 0) {
                    count++;
                }
                temp /= 2;
            }
            if (count <= k) {
                break;
            }
            buyBottle++;
        }
        System.out.println(buyBottle);
    }
}
