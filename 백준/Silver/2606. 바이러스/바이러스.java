import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int node;
    static int line;
    static int count;
    static int[][] graph;
    static boolean[] visit;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        graph = new int[node+1][node+1];
        visit = new boolean[node+1];
        for(int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        dfs(1);
        System.out.println(count - 1);
    }

    public static void dfs(int start) {
        visit[start] = true;
        count++;
        for(int i = 0; i <= node; i++) {
            if(graph[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
}