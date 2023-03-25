import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int[][] graph;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }
        dfs(0, 0, n);
        System.out.println(sb);
    }
    static void dfs(int row, int col, int size) {
        if (check(row, col, size)) {
            sb.append(graph[row][col]);
            return;
        }
        int halfSize = size / 2;
        sb.append('(');
        dfs(row, col, halfSize);
        dfs(row, col + halfSize, halfSize);
        dfs(row + halfSize, col, halfSize);
        dfs(row + halfSize, col + halfSize, halfSize);
        sb.append(')');
    }
    static boolean check(int row, int col, int size) {
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (graph[i][j] != graph[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}
