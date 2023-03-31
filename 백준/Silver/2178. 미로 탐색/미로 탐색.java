import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][m+1];
        visit = new boolean[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 1; j <= m; j++) {
                map[i][j] = s.charAt(j-1) - '0';
            }
        }
        bfs(1, 1);
        System.out.println(map[n][m]);
    }
    public static void bfs(int x, int y) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int cx = temp[0];
            int cy = temp[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx < 0 || ny < 0 || nx > n || ny > m) {
                    continue;
                }
                if (!visit[nx][ny] && map[nx][ny] != 0) {
                    queue.add(new int[]{nx, ny});
                    map[nx][ny] = map[cx][cy] + 1;
                    visit[nx][ny] = true;
                }
            }
        }
    }
}
