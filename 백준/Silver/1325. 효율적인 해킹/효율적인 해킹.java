import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static int count;
    static boolean[] visit;
    static int max = Integer.MIN_VALUE;
    static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(b).add(a);
        }
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            visit = new boolean[n + 1];
            count = 0;
            bfs(i);
            result[i] = count;
            max = Math.max(max, count);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (result[i] == max) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
    static void bfs(int num) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(num);
        visit[num] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i : list.get(cur)) {
                if (!visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                    count++;
                }
            }
        }
    }
}