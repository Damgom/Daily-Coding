import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2553 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2553 마지막 팩토리얼 수
         * @math
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            result %= 1000000000;
            while (result % 10 == 0) {
                result /= 10;
            }
        }
        System.out.println(result % 10);
    }
}
