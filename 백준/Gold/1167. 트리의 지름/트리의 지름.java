import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static int n;
    static List<List<Node>> list = new ArrayList<>();
    static boolean[] visit;
    static int answer = 0;
    static int node;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int index = Integer.parseInt(input[0]);
            int j = 1;
            while (true) {
                int num = Integer.parseInt(input[j]);
                if (num == -1) {
                    break;
                }
                int weight = Integer.parseInt(input[j+1]);
                list.get(index).add(new Node(num, weight));

                j += 2;
            }
        }
//        for (int i = 1; i <= n; i++) {
//            visit = new boolean[n+1];
//            visit[i] = true;
//            dfs(i, 0);
////            bfs(i);
//        }
        visit = new boolean[n+1];
        dfs(1, 0);
        visit = new boolean[n+1];
        dfs(node, 0);
        System.out.println(answer);
    }
    static void dfs(int start, int length) {
        if (length > answer) {
            answer = length;
            node = start;
        }
        visit[start] = true;
        for (Node node : list.get(start)) {
            if (!visit[node.num]) {
                visit[node.num] = true;
                dfs(node.num, length + node.weight);
            }
        }
    }
    static void bfs(int start) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, 0));
        visit[start] = true;
        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            for (Node node : list.get(curNode.num)) {
                if (!visit[node.num]) {
                    visit[node.num] = true;
                    queue.add(new Node(node.num, node.weight + curNode.weight));
                }
            }
            answer = Math.max(answer, curNode.weight);
        }
    }
    static class Node {
        int num;
        int weight;

        public Node(int num, int weight) {
            this.num = num;
            this.weight = weight;
        }
    }
}
