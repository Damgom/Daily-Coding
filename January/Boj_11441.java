import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11441 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_11441 합 구하기
         * @CumulativeSum
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = arr[i-1] + temp;
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int result = arr[end] - arr[start - 1];
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}

// 10 30 60 100 150

