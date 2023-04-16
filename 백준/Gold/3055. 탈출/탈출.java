import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int r, c;
    static char[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] count;
    static Queue<int[]> queue = new ArrayDeque<>();
    static Queue<int[]> water = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];
        count = new int[r][c];
        int[] exit = new int[2];
        for (int i = 0; i < r; i++) {
            String temp = br.readLine();
            for (int j = 0; j < c; j++) {
                char status = temp.charAt(j);
                map[i][j] = status;
                if (status == 'S') {
                    queue.add(new int[]{i, j});
                }else if (status == '*') {
                    water.add(new int[]{i, j});
                }else if (status == 'D') {
                    exit = new int[]{i, j};
                }
            }
        }
        bfs();
        System.out.println(count[exit[0]][exit[1]] == 0 ? "KAKTUS" : count[exit[0]][exit[1]]);

    }
    static void bfs() {
        while (!queue.isEmpty()) {
            moveWater();
            int queueLength = queue.size();
            for (int i = 0; i < queueLength; i++) {
                int[] curStatus = queue.poll();
                int curX = curStatus[0];
                int curY = curStatus[1];
                for (int j = 0; j < 4; j++) {
                    int nx = curX + dx[j];
                    int ny = curY + dy[j];
                    if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                        if (map[nx][ny] == 'D') {
                            count[nx][ny] = count[curX][curY] + 1;
                            return;
                        }else if (map[nx][ny] == '.') {
                            map[nx][ny] = 'S';
                            count[nx][ny] = count[curX][curY] + 1;
                            queue.add(new int[]{nx, ny});
                        }
                    }
                }
            }
        }
    }
    static void moveWater() {
        int waterLength = water.size();
        for (int i = 0; i < waterLength; i++) {
            int[] curWater = water.poll();
            int curWaterX = curWater[0];
            int curWaterY = curWater[1];
            for (int j = 0; j < 4; j++) {
                int nextWaterX = curWaterX + dx[j];
                int nextWaterY = curWaterY + dy[j];
                if (nextWaterX >= 0 && nextWaterY >= 0 && nextWaterX < r && nextWaterY < c && map[nextWaterX][nextWaterY] == '.') {
                    map[nextWaterX][nextWaterY] = '*';
                    water.add(new int[]{nextWaterX, nextWaterY});
                }
            }
        }
    }
}
