import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int r, c;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> queue = new ArrayDeque<>();
    static Queue<int[]> fire = new ArrayDeque<>();
    static boolean[][] visit;
    static int count;
    static boolean flag;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        visit = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                char temp = s.charAt(j);
                if (temp == 'J') {
                    visit[i][j] = true;
                    queue.add(new int[]{i, j});
                }else if (temp == 'F') {
                    fire.add(new int[]{i, j});
                }
                map[i][j] = temp;
            }
        }
        if (bfs()) {
            System.out.println(count);
        }else System.out.println("IMPOSSIBLE");
    }
    static boolean bfs() {
        while (!queue.isEmpty()) {
            count++;
            moveFire();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curD = queue.poll();
                int cx = curD[0];
                int cy = curD[1];
                for (int j = 0; j < 4; j++) {
                    int nx = cx + dx[j];
                    int ny = cy + dy[j];
                    if (nx < 0 || ny < 0 || nx >= r || ny >= c) {
                        return true;
                    }
                    if (visit[nx][ny] || map[nx][ny] != '.') {
                        continue;
                    }
                    visit[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return false;
    }
    static void moveFire() {
        int fireSize = fire.size();
        for (int i = 0; i < fireSize; i++) {
            int[] curFire = fire.poll();
            int fireX = curFire[0];
            int fireY = curFire[1];
            for (int j = 0; j < 4; j++) {
                int nextFireX = fireX + dx[j];
                int nextFireY = fireY + dy[j];
                if (nextFireX < 0 || nextFireY < 0 || nextFireX >= r || nextFireY >= c) {
                    continue;
                }
                if (map[nextFireX][nextFireY] == '#' || map[nextFireX][nextFireY] == 'F') {
                    continue;
                }
                map[nextFireX][nextFireY] = 'F';
                fire.add(new int[]{nextFireX, nextFireY});
            }
        }
    }
}
