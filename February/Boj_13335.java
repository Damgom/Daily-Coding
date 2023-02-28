import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_13335 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_13335 트럭
         * @queue
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int bridgeLength = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        Queue<Integer> truck = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            truck.offer(Integer.parseInt(st.nextToken()));
        }
        Queue<Integer> bridge = new ArrayDeque<>();
        for (int i = 0; i < bridgeLength; i++) {
            bridge.offer(0);
        }
        int time = 0;
        int curWeight = 0;
        while (!bridge.isEmpty()) {
            curWeight -= bridge.poll();
            if (!truck.isEmpty()) {
                if (truck.peek() + curWeight <= limit) {
                    curWeight += truck.peek();
                    bridge.offer(truck.poll());
                }else {
                    bridge.offer(0);
                }
            }
            time++;
        }
        System.out.println(time);
    }
}
