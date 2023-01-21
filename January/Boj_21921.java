import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_21921 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_21921 블로그
         * @SlidingWindow
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }
        int max = sum;
        int count = 1;
        for (int i = x; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - x];
            if (sum > max) {
                max = sum;
                count = 1;
            }else if (max == sum) {
                count++;
            }
        }
        if (max == 0) {
            System.out.println("SAD");
        }else {
            System.out.println(max + "\n" + count);
        }
    }
}
