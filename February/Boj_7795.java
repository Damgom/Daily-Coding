import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_7795 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_7795 먹을 것인가 먹힐 것인가
         * @TwoPointer
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] arrA = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }
            int[] arrB = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arrB);
            int answer = 0;
            for (int j = 0; j < n; j++) {
                for (int k = m-1; k >= 0; k--) {
                    if (arrA[j] > arrB[k]) {
                        answer += k + 1;
                        break;
                    }
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}