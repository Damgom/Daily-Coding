import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static ArrayList<Integer> list[];
    static boolean visit[];
    static int destination,distance, count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        list = new ArrayList[n+1];
        visit = new boolean[n+1];
        for(int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        bfs();
        System.out.println(destination + " " + distance + " " + count);
    }

    static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        visit[1] = true;
        queue.offer(new int[]{1,0});
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int start = temp[0];
            int end = temp[1];
            if (end > distance){
                distance = end;
                destination = start;
                count = 1;
            }
            else if (end == distance) {
                if (destination > start) {
                    destination = start;
                }
                count++;
            }
            for (int i = 0; i < list[start].size(); i++) {
                int next = list[start].get(i);
                if (!visit[next]){
                    visit[next] = true;
                    queue.offer(new int[]{next, end + 1});
                }
            }
        }
    }
}