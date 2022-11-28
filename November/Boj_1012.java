import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1012 {
    /*
    boj_1012 , 유기농 배추 dfs
     */
    static int n, m, k;
    static int[][] graph;
    static boolean[][] visit;
    static int count;
    static int[] dx = new int[]{0, 0, -1, 1};
    static int[] dy = new int[]{-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            graph = new int[m][n];
            visit = new boolean[m][n];
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a][b] = 1;
            }

            for(int j = 0; j < m; j++) {
                for(int k = 0; k < n; k++) {
                    if(graph[j][k] == 1 && !visit[j][k]) {
                        dfs(j, k);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int x, int y) {
        visit[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int cur_X = x + dx[i];
            int cur_Y = y + dy[i];

            if(cur_X >= 0 && cur_Y >= 0 && cur_X < m && cur_Y < n) {
                if(graph[cur_X][cur_Y] == 1 && !visit[cur_X][cur_Y]) {
                    dfs(cur_X, cur_Y);
                }
            }
        }
    }
}