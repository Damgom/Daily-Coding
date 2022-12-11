import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2644 {
    /*
    boj_2644 촌수계산 dfs
     */
    static int node;
    static int start;
    static int target;
    static int[][] graph;
    static boolean[] visit;
    static int edges;
    static int count = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        graph = new int[node+1][node+1];
        visit= new boolean[node+1];
        edges = Integer.parseInt(br.readLine());
        for(int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        dfs(start, 0);
        System.out.println(count);
    }
    public static void dfs(int start, int move) {
        if(start == target) {
            count = move;
            return;
        }
        visit[start] = true;
        for(int i = 1; i <= node; i++) {
            if(!visit[i] && graph[start][i] == 1) {
                dfs(i, move+1);
            }
        }
    }
}