import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static boolean[] visit;
    static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        visit = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        visit[1] = true;
        dfs(1, 0);
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (visit[i]) {
                answer++;
            }
        }
        System.out.println(answer-1);
    }
    static void dfs(int start, int depth) {
        if (depth == 2) {
            return;
        }
        for (int i : list.get(start)) {
            visit[i] = true;
            dfs(i, depth+1);
        }
    }
}
