import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_24479 {
    /*
    boj_24479 알고리즘 수업 - 깊이 우선 탐색 1 dfs
    2차원배열로 간선을 연결할 경우 시간초과
     */
    static int n, m, r;
//    static int[][] graph;
//    static boolean[] visit;
    static StringBuilder sb;
    static List<ArrayList<Integer>> graph;
    static int[] visit;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        visit = new int[n+1];
        sb = new StringBuilder();
        for(int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for(int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        count = 1;
        dfs(r);
        for(int i = 1; i < visit.length; i++) {
            sb.append(visit[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void dfs(int start) {
        visit[start] = count;
        for(int i = 0; i < graph.get(start).size(); i++) {
            int newStart = graph.get(start).get(i);
            if(visit[newStart] == 0) {
                count++;
                dfs(newStart);
            }
        }
    }
}
        // 시간초과
//        graph = new int[n+1][n+1];
//        visit = new boolean[n+1];
//        sb = new StringBuilder();
//        for(int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            graph[a][b] = graph[b][a] = 1;
//        }
//
//        dfs(r);

//    }
//    public static void dfs(int start) {
//        visit[start] = true;
//
//        for(int i = 1; i <= n; i++) {
//            if(graph[start][i] == 1 && !visit[i]) {
//                dfs(i);
//            }
//        }
//    }
//}