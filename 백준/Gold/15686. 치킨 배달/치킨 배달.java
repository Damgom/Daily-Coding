import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] map;
    static boolean[] open;
    static List<Point> chicken = new ArrayList<>();
    static List<Point> person = new ArrayList<>();
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == 2) {
                    chicken.add(new Point(i, j));
                }else if (temp == 1) {
                    person.add(new Point(i, j));
                }
                map[i][j] = temp;
            }
        }
        open = new boolean[chicken.size()];
        dfs(0, 0);
        System.out.println(answer);
    }
    static void dfs(int start, int count) {
        if (count == m) {
            int result = 0;
            for (int i = 0; i < person.size(); i++) {
                int temp = Integer.MAX_VALUE;
                for (int j = 0; j < chicken.size(); j++) {
                    if (open[j]) {
                        int distance = Math.abs(person.get(i).x - chicken.get(j).x)
                                + Math.abs(person.get(i).y - chicken.get(j).y);
                        temp = Math.min(temp, distance);
                    }
                }
                result += temp;
            }
            answer = Math.min(answer, result);
            return;
        }
        for (int i = start; i < chicken.size(); i++) {
            open[i] = true;
            dfs(i+1, count+1);
            open[i] = false;
        }
    }
    static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
