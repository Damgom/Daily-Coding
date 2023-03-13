import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10026 {
    /**
     * @Boj_10026 적록색약
     * @dfs
     */
    static char[][] graph;
    static char[][] weak;
    static int n;
    static boolean[][] visited;
    static int count, wCount;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new char[n][n];
        weak = new char[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                char temp = s.charAt(j);
                graph[i][j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    count++;
                    dfs(i, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char temp = graph[i][j];
                if (temp == 'G') {
                    graph[i][j] = 'R';
                }
            }
        }
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j]) {
                    wCount++;
                    dfs(i, j);
                }
            }
        }
        System.out.println(count + " " + wCount);
    }
    static void dfs(int x, int y) {
        char compare = graph[x][y];
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                continue;
            }
            if (!visited[nextX][nextY] && graph[nextX][nextY] == compare) {
                dfs(nextX, nextY);
            }
        }
    }
}
