import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, k;
    static boolean[] visit;
    static final int MAX = 100000;
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        visit = new boolean[MAX+1];
        bfs();
        System.out.println(result);
    }
    static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(n, 0));
        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            visit[curNode.location] = true;
            if (curNode.location == k) {
                result = Math.min(result, curNode.time);
            }
            if (curNode.location * 2 <= MAX && !visit[curNode.location*2]) {
                queue.add(new Node(curNode.location * 2, curNode.time));
            }
            if (curNode.location + 1 <= MAX && !visit[curNode.location+1]) {
                queue.add(new Node(curNode.location + 1, curNode.time + 1));
            }
            if (curNode.location - 1 >= 0 && !visit[curNode.location-1]) {
                queue.add(new Node(curNode.location - 1, curNode.time + 1));
            }
        }
    }
    static class Node {
        int location;
        int time;

        public Node(int location, int time) {
            this.location = location;
            this.time = time;
        }
    }
}
