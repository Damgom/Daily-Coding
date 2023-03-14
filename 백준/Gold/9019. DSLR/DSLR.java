import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static String[] result;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            visited = new boolean[10000];
            result = new String[10000];
            Arrays.fill(result, "");
            bfs(a, b);
            System.out.println(result[b]);
        }
    }
    static void bfs(int a, int b) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(a);
        visited[a] = true;
        while (!queue.isEmpty() && !visited[b]) {
            int temp = queue.poll();
            int d = (2 * temp) % 10000;
            int s = (temp == 0) ? 9999 : temp - 1;
            int l = (temp % 1000) * 10 + temp / 1000;
            int r = (temp % 10) * 1000 + temp / 10;
            if (!visited[d]) {
                queue.add(d);
                visited[d] = true;
                result[d] = result[temp] + "D";
            }
            if (!visited[s]) {
                queue.add(s);
                visited[s] = true;
                result[s] = result[temp] + "S";
            }
            if (!visited[l]) {
                queue.add(l);
                visited[l] = true;
                result[l] = result[temp] + "L";
            }
            if (!visited[r]) {
                queue.add(r);
                visited[r] = true;
                result[r] = result[temp] + "R";
            }
        }
    }
}
