import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[] visit = new boolean[100001];
        if (n == k) {
            System.out.println(0);
            return;
        }
        visit[n] = true;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(n);
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int temp = queue.poll();
                visit[temp] = true;
                if (temp - 1 == k || temp + 1 == k || temp * 2 == k) {
                    System.out.println(count);
                    return;
                }
                if (temp - 1 >= 0 && !visit[temp - 1]) {
                    visit[temp - 1] = true;
                    queue.add(temp - 1);
                }
                if (temp + 1 <= 100000 && !visit[temp + 1]) {
                    visit[temp + 1] = true;
                    queue.add(temp + 1);
                }
                if (temp * 2 <= 100000 && !visit[temp * 2]) {
                    visit[temp * 2] = true;
                    queue.add(temp * 2);
                }
            }
        }
    }
}
