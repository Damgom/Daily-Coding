import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_24480 {
    /*
    boj_24480 알고리즘 수업 - 깊이 우선 탐색 2
     */

    static int n, m, r;
    static Map<Integer, List<Integer>> graph;
    static int[] visit;
    static StringBuilder sb;
    static StringTokenizer st;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        graph = new HashMap<>();
        visit = new int[n+1];
        for(int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for(int i = 1; i <= n; i++) {
            graph.get(i).sort(Collections.reverseOrder());
        }
        count = 1;
        dfs(r);
        for(int i = 1; i <= n; i++) {
            System.out.println(visit[i]);
        }
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