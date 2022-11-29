import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_4963 {
    /*
    boj_4963 , 섬의 개수, graph
    연결되지 않은 섬의 개수를 구하는 문제
    대각선으로 이어진 경우에도 연결된 것으로 본다
    dx, dy를 이용해 연결된 정점을 모두 탐색하는 방식
     */
    static int n, m;
    static int[][] graph;
    static boolean[][] visit;
    static StringTokenizer st;
    static int count;
    static int[] dx = new int[]{-1, 0, 1};
    static int[] dy = new int[]{-1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            graph = new int[n][m];
            visit = new boolean[n][m];
            if(n == 0 && m == 0) {
                break;
            }
            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()) {
                    for(int j = 0; j < m; j++) {
                        graph[i][j] = Integer.parseInt(st.nextToken());
                    }
                }
            }
            count = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(graph[i][j] == 1 && !visit[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static void dfs(int x, int y) {
        visit[x][y] = true;

        for(int i = 0; i < 3; i++) {
            int curX = x + dx[i];
            for(int j = 0; j < 3; j++) {
                int curY = y + dy[j];

                if(curX >= 0 && curY >= 0 && curX < n && curY < m) {
                    if(graph[curX][curY] == 1 && !visit[curX][curY]) {
                        dfs(curX, curY);
                    }
                }
            }
        }
    }
}