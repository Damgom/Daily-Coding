import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_24444 {
    /*
    boj_24444 알고리즘 수업 - 너비 우선 탐색 1 bfs
     */
    static int node;
    static int edges;
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edges = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        visit= new int[node+1];

        for(int i = 0; i <= node; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for(int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }
        bfs(r);
        for(int i = 1; i <= node; i++) {
            System.out.println(visit[i]);
        }
    }
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        queue.offer(start);
        visit[start] = count;
        count++;

        while(!queue.isEmpty()) {
            int a = queue.poll();

            for(int i = 0; i < graph.get(a).size(); i++) {
                int next = graph.get(a).get(i);
                if(visit[next] != 0) {
                    continue;
                }
                queue.offer(next);
                visit[next] = count;
                count++;
            }
        }
    }
}