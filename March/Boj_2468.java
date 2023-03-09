import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2468 {
    /**
     * @Boj_2468 안전 영역
     * @dfs
     */
    static int n;
    static int[][] graph;
    static boolean[][] visited;
    static int maxHeight;
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                graph[i][j] = temp;
                if (temp > maxHeight) {
                    maxHeight = temp;
                }
            }
        }
        int max = 0;
        for (int i = 0; i <= maxHeight; i++) {
            visited = new boolean[n][n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (!visited[j][k] && graph[j][k] > i) {
                        dfs(j, k, i);
                        count++;
                    }
                }
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
    }
    static void dfs(int x, int y, int z) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                continue;
            }
            if (!visited[nextX][nextY] && graph[nextX][nextY] > z) {
                dfs(nextX, nextY, z);
            }
        }
    }
}
