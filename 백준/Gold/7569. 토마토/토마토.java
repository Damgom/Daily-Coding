import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][][] graph;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int n, m, h;
    static Queue<int[]> queue = new ArrayDeque<>();
    static int result = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        graph = new int[h][n][m];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    int temp = Integer.parseInt(st.nextToken());
                    graph[i][j][k] = temp;
                    if (temp == 1) {
                        queue.add(new int[]{i, j, k});
                    }
                }
            }
        }
        bfs();
        System.out.println(solve());
    }
    static void bfs() {
        while (!queue.isEmpty()) {
            int[] tomato = queue.poll();
            int curZ = tomato[0];
            int curX = tomato[1];
            int curY = tomato[2];
            for (int i = 0; i < 6; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];
                int nextZ = curZ + dz[i];
                if (nextX < 0 || nextY < 0 || nextZ < 0 || nextX >= n || nextY >= m || nextZ >= h) {
                    continue;
                }
                if (graph[nextZ][nextX][nextY] == 0) {
                    queue.add(new int[]{nextZ, nextX, nextY});
                    graph[nextZ][nextX][nextY] = graph[curZ][curX][curY] + 1;
                }
            }
        }
    }
    static int solve() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (graph[i][j][k] == 0) {
                        return -1;
                    }
                    result = Math.max(result, graph[i][j][k]);
                }
            }
        }
        if (result == 1) {
            return 0;
        }else return result -1;
    }
}
