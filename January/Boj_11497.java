import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_11497 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_11497 통나무 건너뛰기
         * @Greedy,Sort
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] bridge = new int[n];
            for (int j = 0; j < n; j++) {
                bridge[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(bridge);
            int[] customBridge = new int[n];
            int left = 0;
            int right = n - 1;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    customBridge[left] = bridge[j];
                    left++;
                } else {
                    customBridge[right] = bridge[j];
                    right--;
                }
            }
            int result = customBridge[n - 1] - customBridge[0];
            for (int j = 0; j < n - 1; j++) {
                result = Math.max(result, Math.abs(customBridge[j + 1] - customBridge[j]));
            }
            answer.append(result).append("\n");
        }
        System.out.println(answer);
    }
}