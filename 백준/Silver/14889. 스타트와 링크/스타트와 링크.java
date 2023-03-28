import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] team;
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        team = new int[n][n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                team[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0);
        System.out.println(min);
    }
    static void solve(int index, int count) {
        if (count == n / 2) {
            score();
            return;
        }
        for (int i = index; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                solve(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }
    static void score() {
        int start = 0;
        int link = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visit[i] && visit[j]) {
                    start += team[i][j];
                    start += team[j][i];
                }else if (!visit[i] && !visit[j]) {
                    link += team[i][j];
                    link += team[j][i];
                }
            }
        }
        int temp = Math.abs(start - link);
        min = Math.min(temp, min);
    }
}
