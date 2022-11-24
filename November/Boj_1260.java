import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1260 {
    /*
    bfs, dfs 실버2
     */
    static int[][] arr;
    static int n;
    static int m;
    static int v;
    static StringTokenizer st;
    static boolean[] visit;
    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        visit = new boolean[n+1];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }
        dfs(v);
        sb.append("\n");

        visit = new boolean[n+1];
        bfs(v);
        System.out.println(sb);
    }
    public static void dfs(int start) {
        visit[start] = true;
        sb.append(start).append(" ");
        for(int i = 1; i <= n; i++) {
            if(arr[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        queue.add(start);
        visit[start] = true;

        while(!queue.isEmpty()) {
            start = queue.poll();
            sb.append(start).append(" ");

            for(int i = 1; i <= n; i++) {
                if(arr[start][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}