import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_15810 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_15810 풍선 공장
         * @binarySearch
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long start = 0L;
        long end = (long) arr[0] * m;
        while (start <= end) {
            long mid = (start + end) / 2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += mid / arr[i];
            }
            if (count < m) {
                start = mid + 1;
            }else end = mid - 1;
        }
        System.out.println(start);
    }
}
