import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11724 {
    static boolean[] visit;
    static int n;
    static int m;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        /*
        boj_11724 연결 요소의 개수 실버2
        dfs
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n+1][n+1];
        visit = new boolean[n+1];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if(!visit[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }
    public static void dfs(int start) {
        visit[start] = true;
        for(int i = 1; i <= n; i++) {
            if(graph[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
}