import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2606 {
    /*
    그래프 기초, dfs를 활용
    양방향 인접행렬 값 넣어주고, boolean 배열을 통해 감염된 컴퓨터를 표시
    출력값에 -1 해주는 이유는 초기 감염된 컴퓨터의 숫자를 빼주기 위함
     */
    static int[][] graph;
    static boolean[] check;
    static int count;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        check = new boolean[n+1];
        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }
        dfs(1);
        System.out.println(count-1);
    }
    public static void dfs(int start) {
        check[start] = true;
        count++;
        for(int i = 0; i <= n; i++) {
            if(graph[start][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
    }
}