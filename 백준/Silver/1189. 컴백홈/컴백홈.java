import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int r, c, k;
    static char[][] camp;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        camp = new char[r][c];
        visit = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                char temp = s.charAt(j);
                camp[i][j] = temp;
                if (temp == 'T') {
                    visit[i][j] = true;
                }
            }
        }
        visit[r-1][0] = true;
        dfs(r-1, 0, 1);
        System.out.println(count);
    }
    static void dfs(int x, int y, int depth) {
        if (x == 0 && y == c-1) {
            if (depth == k) {
                count++;
            }
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= r || ny >= c || visit[nx][ny]) {
                continue;
            }
            visit[nx][ny] = true;
            dfs(nx, ny, depth+1);
            visit[nx][ny] = false;
        }
    }
}