import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj_14002 {
    public static void main(String[] args) throws IOException {
        /**
         * @boj_14002 가장 긴 증가하는 부분 수열 4
         * @DynamicProgramming
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n];
        dp[0] = 1;
        int answer = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            answer = Math.max(dp[i], answer);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(answer).append('\n');
        // temp는 최장수열의 길이를 의미함, dp배열에서 수열의 길이가 1씩 줄어드는 곳의 인덱스를 찾아 원본 배열의 값을 deque에 넣어줌
        int temp = answer;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            if (temp == dp[i]) {
                deque.addLast(arr[i]);
                temp--;
            }
        }
        while (!deque.isEmpty()) {
            sb.append(deque.pollLast()).append(' ');
        }
        System.out.println(sb);
    }
}
