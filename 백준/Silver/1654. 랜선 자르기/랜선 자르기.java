import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long[] cable = new long[k];
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            long temp = Long.parseLong(br.readLine());
            cable[i] = temp;
            if (temp > max) {
                max = temp;
            }
        }
        long left = 0;
        long right = max + 1;
        long mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            long count = 0;
            for (int i = 0; i < k; i++) {
                count += cable[i] / mid;
            }
            if (count < n) {
                right = mid;
            }else left = mid + 1;
        }
        System.out.println(left - 1);
    }
}