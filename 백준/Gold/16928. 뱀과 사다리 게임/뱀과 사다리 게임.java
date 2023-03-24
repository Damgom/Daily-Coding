import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr;
    static boolean[] visit;
    static int[] dice = {1,2,3,4,5,6};
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[101];
        visit = new boolean[101];
        for (int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a] = b;
        }
        bfs(1);
    }
    static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        int[] check = new int[101];
        queue.add(start);
        visit[start] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (cur == 100) {
                System.out.println(check[100]);
                return;
            }
            for (int i = 0; i < 6; i++) {
                int next = cur + dice[i];
                if (next > 100 || visit[next]) {
                    continue;
                }
                if (arr[next] == 0) {
                    visit[next] = true;
                    queue.add(next);
                    check[next] = check[cur] + 1;
                }else if (arr[next] != 0 && !visit[arr[next]]) {
                    queue.add(arr[next]);
                    visit[arr[next]] = true;
                    check[arr[next]] = check[cur] + 1;
                }
            }
        }
    }
}
