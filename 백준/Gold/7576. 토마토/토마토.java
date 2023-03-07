import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] box;
    static boolean[][] visited;
    static Queue<int[]> queue = new ArrayDeque<>();
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static int result = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        box = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int temp = Integer.parseInt(st.nextToken());
                box[i][j] = temp;
                if (temp == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        bfs();
        System.out.println(result);
    }
    public static void bfs() {
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int curX = temp[0];
            int curY = temp[1];
            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                    continue;
                }
                if (!visited[nextX][nextY] && box[nextX][nextY] == 0) {
                    queue.add(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    box[nextX][nextY] = box[curX][curY] + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int temp = box[i][j];
                if (temp == 0) {
                    result = -1;
                    return;
                }
                if (temp > result) {
                    result = temp - 1;
                }
            }
        }
    }
}
