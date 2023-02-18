import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1735 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_1735 분수 합
         * @math
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numerator = Integer.parseInt(st.nextToken());
        int denominator = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int numerator2 = Integer.parseInt(st.nextToken());
        int denominator2 = Integer.parseInt(st.nextToken());
//        int lcm = lcm(denominator, denominator2);
//        int resultNumerator = (lcm / denominator) * numerator + (lcm / denominator2) * numerator2;
        int sumNumerator = denominator2 * numerator + denominator * numerator2;
        int sumDenominator = denominator * denominator2;
        int gcd = gcd(sumNumerator, sumDenominator);
        sumDenominator /= gcd;
        sumNumerator /= gcd;
        System.out.println(sumNumerator + " " + sumDenominator);
    }
    public static int gcd(int a, int b) {
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }
}
