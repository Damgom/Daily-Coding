import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_16401 {
    /**
     * @Boj_16401 과자 나눠주기
     * @binarySearch
     */
    static int[] arr;
    static int n, m, result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }
        Arrays.sort(arr);
        binarySearch(1, arr[n-1]);
        System.out.println(result);
    }
    public static void binarySearch(int start, int end) {
        if (start > end) return;
        int mid = (start + end) / 2;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += arr[i] / mid;
        }
        if (count >= m) {
            if (result < mid) {
                result = mid;
                binarySearch(mid + 1, end);
            }
        }else {
            binarySearch(start, mid - 1);
        }
    }
}
