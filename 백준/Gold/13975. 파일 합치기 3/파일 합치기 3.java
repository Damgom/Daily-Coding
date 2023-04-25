import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            PriorityQueue<Long> queue = new PriorityQueue<>();
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                queue.add(Long.parseLong(st.nextToken()));
            }
            long sum = 0;
            while (queue.size() > 1) {
                long a = queue.poll();
                long b = queue.poll();
                sum += a + b;
                queue.add(a + b);
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
