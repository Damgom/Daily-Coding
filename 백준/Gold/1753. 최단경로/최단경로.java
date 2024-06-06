import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int v, e, k;
    static int[] distance;
    static boolean[] visit;
    static final int STANDARD = 3000000;
    static StringTokenizer st;
    static List<List<Node>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());
        distance = new int[v+1];
        visit = new boolean[v+1];
        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.get(u).add(new Node(v, w));
        }
        dijkstra(k);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= v; i++) {
            int temp = distance[i];
            if (temp >= STANDARD) {
                sb.append("INF").append("\n");
            }else {
                sb.append(distance[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
    static void dijkstra(int start) {
        Arrays.fill(distance, STANDARD);
        Arrays.fill(visit, false);
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start, 0));
        distance[start] = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll().num;
            if (!visit[cur]) {
                visit[cur] = true;
                List<Node> nodeList = list.get(cur);
                for (Node node : nodeList) {
                    if (distance[node.num] > distance[cur] + node.weight && !visit[node.num]) {
                        distance[node.num] = distance[cur] + node.weight;
                        queue.add(new Node(node.num, distance[node.num]));
                    }
                }
            }
        }
    }
    static class Node implements Comparable<Node>{
        int num;
        int weight;

        public Node(int num, int weight) {
            this.num = num;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }
}
