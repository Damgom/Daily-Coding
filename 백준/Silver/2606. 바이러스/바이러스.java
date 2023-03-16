import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int node;
    static int line;
    static int[][] graph;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        graph = new int[node+1][node+1];
        visited = new boolean[node+1];
        while (line-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
//        System.out.println(bfs(1));
        dfs(1);
        System.out.println(count);
    }
    static int bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = true;
        int count = 0;
        while (!queue.isEmpty()) {
            int curNode = queue.poll();
            for (int i = 0; i <= node; i++) {
                if (graph[curNode][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
        return count;
    }
    static void dfs(int start) {
        visited[start] = true;
        for(int i = 0; i <= node; i++) {
            if(graph[start][i] == 1 && !visited[i]) {
                count++;
                dfs(i);
            }
        }
    }
}
