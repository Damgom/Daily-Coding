import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int f, s, g, u, d;
    static int[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        visit = new int[f + 1];
        bfs();
    }
    static void bfs() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(s);
        visit[s] = 1;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (cur == g) {
                System.out.println(visit[cur] - 1);
            }
            if (cur + u <= f && visit[cur + u] == 0) {
                visit[cur + u] = visit[cur] + 1;
                queue.add(cur + u);
            }
            if (cur - d > 0 && visit[cur - d] == 0) {
                visit[cur - d] = visit[cur] + 1;
                queue.add(cur - d);
            }
        }
        if (visit[g] == 0) {
            System.out.println("use the stairs");
        }
    }
}
