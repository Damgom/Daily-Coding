import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_11725 {
    /*
    boj_11725 트리의 부모 찾 dfs
     */
    static int node;
    static int[][] graph;
    static List<List<Integer>> list = new ArrayList<>();
    static int[] parents;
    static boolean[] visit;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
//        graph = new int[node+1][node+1];
        visit = new boolean[node+1];
        parents = new int[node+1];
        for(int i = 0; i <= node; i++) {
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < node-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
//            graph[a][b] = graph[b][a] = 1;
            list.get(a).add(b);
            list.get(b).add(a);
        }
        dfs(1);
        for(int i = 2; i <= node; i++) {
            System.out.println(parents[i]);
        }
    }
    public static void dfs(int start) {
        visit[start] = true;
//        for(int i = 1; i <= list.get(start).size(); i++) {
//            if(graph[start][i] == 1 && !visit[i]) {
//                parents[i] = start;
//                dfs(i);
//            }
//        }
        for(int i : list.get(start)) {
            if (!visit[i]) {
                parents[i] = start;
                dfs(i);
            }
        }
    }
}