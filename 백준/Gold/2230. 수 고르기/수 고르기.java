import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int start = 0;
        int end = 0;
        int minValue = Integer.MAX_VALUE;
        while (start <= end) {
            int diff = arr[end] - arr[start];
            if (diff >= m) {
                start++;
                minValue = Math.min(diff, minValue);
                if (minValue == m) {
                    break;
                }
            }else {
                end++;
                if (end == n) {
                    break;
                }
            }
        }
        System.out.println(minValue);
    }
}
