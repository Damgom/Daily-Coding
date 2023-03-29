import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m, x, y;
    static int[][] map;
    static int[] dice;
    static int[] dy = {1, -1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        dice = new int[7];
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++){
            int direction = Integer.parseInt(st.nextToken());
            moveDice(direction);
        }
    }
    static void moveDice(int direction) {
        int nextX = x + dx[direction - 1];
        int nextY = y + dy[direction - 1];
        if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) return;
//        if (check(nextX, nextY)) {
        roll(direction, nextX, nextY);
        x = nextX;
        y = nextY;
//        }
    }
//    static boolean check(int x, int y) {
//        return x >= 0 && y >= 0 && x <= m - 1 && y <= n - 1;
//    }
    static void roll(int direction, int x, int y) {
        int temp = dice[3];
        switch(direction) {
            case 1:
                dice[3] = dice[4];
                dice[4] = dice[6];
                dice[6] = dice[2];
                dice[2] = temp;
                break;
            case 2:
                dice[3] = dice[2];
                dice[2] = dice[6];
                dice[6] = dice[4];
                dice[4] = temp;
                break;
            case 3:
                dice[3] = dice[5];
                dice[5] = dice[6];
                dice[6] = dice[1];
                dice[1] = temp;
                break;
            case 4:
                dice[3] = dice[1];
                dice[1] = dice[6];
                dice[6] = dice[5];
                dice[5] = temp;
                break;
        }
        if(map[x][y] == 0) {
            map[x][y] = dice[6];
        } else {
            dice[6] = map[x][y];
            map[x][y] = 0;
        }
        System.out.println(dice[3]);
    }
}
