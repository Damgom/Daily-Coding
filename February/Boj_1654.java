import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1654 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_1654 랜선 자르기
         * @binarySearch
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            int temp = Integer.parseInt(br.readLine());;
            arr[i] = temp;
            if (temp > max) {
                max = temp;
            }
        }
        long left = 0;
        // 배열의 모든 값이 같으면 맥시멈 값이 나와야 하기 때문에 맥시멈값에 +1하고 이분탐색 시작
        long right = max + 1;
        while (left < right) {
            long mid = (left + right) / 2;
            long count = 0;
            for (int i = 0; i < k; i++) {
                count += arr[i] / mid;
            }
            if (count < n) {
                right = mid;
            }else left = mid + 1;
        }
        System.out.println(left - 1);
    }
}
