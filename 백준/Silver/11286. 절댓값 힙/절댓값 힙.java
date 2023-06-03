import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            if(Math.abs(o1) > Math.abs(o2)) {
                return Math.abs(o1) - Math.abs(o2);
            }else if(Math.abs(o1) == Math.abs(o2)) {
                return o1 - o2;
            }else return -1;
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0 && !queue.isEmpty()) {
                sb.append(queue.poll()).append('\n');
            } else if (x == 0) {
                sb.append("0").append('\n');
            } else queue.offer(x);
        }
        System.out.println(sb);
    }
}