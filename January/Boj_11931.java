import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Boj_11931 {
    public static void main(String[] args) throws IOException {
        /**
         * @boj_11931 수 정렬하기 4
         * @Sort
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
