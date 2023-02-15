import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2417 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2417 정수 제곱근
         * @binarySearch
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long start = 0;
        long end = n;
        long min = 0;
        while (start <= end) {
            long mid = (start + end) / 2;
            long result = (long) Math.pow(mid, 2);
            if (result >= n) {
                min = mid;
                end = mid - 1;
            }else start = mid + 1;
        }
        System.out.println(min);
    }
}
