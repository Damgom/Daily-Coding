import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1862 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_1862 미터계
         * @Math
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int length = String.valueOf(n).length();
        for (int i = 0; i < length; i++) {
            int digit = n % 10;
            n /= 10;
            if (digit > 4) {
                answer += (digit - 1) * Math.pow(9, i);
            }else answer += digit * Math.pow(9, i);
        }
        System.out.println(answer);
    }
}
