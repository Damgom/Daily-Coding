import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] graph;
    static int max;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
                dfs(i, j, graph[i][j], 1);
                visited[i][j] = false;
            }
        }
        System.out.println(max);
    }
    static void dfs(int x, int y, int sum, int count) {
        if (count == 4) {
            max = Math.max(max, sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                continue;
            }
            if (!visited[nextX][nextY]) {
                int curSum = sum + graph[nextX][nextY];
                if (count == 2) {
                    visited[nextX][nextY] = true;
                    dfs(x, y, curSum, count + 1);
                    visited[nextX][nextY] = false;
                }
                visited[nextX][nextY] = true;
                dfs(nextX, nextY, curSum, count + 1);
                visited[nextX][nextY] = false;
            }
        }
    }
}
