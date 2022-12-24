import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj_15903 {
    public static void main(String[] args) throws IOException {
        /*
        boj_15903, 카드 합체 놀이
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> queue = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            long temp = Integer.parseInt(st.nextToken());
            queue.add(temp);
        }
        for (int i = 0; i < m; i++) {
            long firstElement = queue.poll();
            long secondElement = queue.poll();
            long replaceElement = firstElement + secondElement;
            for (int j = 0; j < 2; j++) {
                queue.add(replaceElement);
            }
        }
        long sum = 0;
        while (!queue.isEmpty()) {
            sum += queue.poll();
        }
        System.out.println(sum);
    }
}