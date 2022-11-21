import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj_2346 {
    public static void main(String[] args) throws IOException {
        /*
        boj_2346 풍선 터뜨리기 실버3
        덱을 이용한 문제
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<int[]> balloon = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder("1 ");

        int firstBalloon = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= n; i++) {
            balloon.offer(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        while (!balloon.isEmpty()) {
            if (firstBalloon > 0) {
                for (int i = 1; i < firstBalloon; i++) {
                    balloon.offer(balloon.pollFirst());
                }
                int[] temp = balloon.pollFirst();
                firstBalloon = temp[1];
                sb.append(temp[0]).append(" ");
            } else {
                for (int i = firstBalloon; i < -1; i++) {
                    balloon.addFirst(balloon.pollLast());
                }
                int[] temp = balloon.pollLast();
                firstBalloon = temp[1];
                sb.append(temp[0]).append(" ");
            }
        }
        System.out.println(sb);
    }
}