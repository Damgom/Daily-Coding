import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_2304 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2304 창고 다각형
         * @bruteforce stack
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int lastIndex = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a] = b;
            if (b > max) {
                max = b;
                maxIndex = a;
            }
            if (a > lastIndex) {
                lastIndex = a;
            }
        }
        // 왼쪽
        int left = 0;
        int temp = arr[0];
        for (int i = 0; i < maxIndex; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
            left += temp;
        }
        // 오른쪽
        int right = 0;
        int rightTemp = arr[lastIndex];
        for (int i = lastIndex; i > maxIndex; i--) {
            if (arr[i] > rightTemp) {
                rightTemp = arr[i];
            }
            right += rightTemp;
        }
        int result = left + right + max;
        System.out.println(result);
    }
}
