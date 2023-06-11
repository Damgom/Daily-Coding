import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[][] graph;
    static boolean[][] visited;
    static boolean[][] dfsVisited;
    static int dfsCount;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static List<Integer> list = new ArrayList<>();
    static int apart = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < n; j++) {
                graph[i][j] = temp.charAt(j) - '0';
            }
        }
        dfsVisited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    apart++;
                    bfs(i, j);
                }
//                if (graph[i][j] == 1 && !dfsVisited[i][j]) {
//                    dfs(i, j);
//                    System.out.println(dfsCount);
//                    dfsCount = 0;
//                }
            }
        }
        Collections.sort(list);
        System.out.println(apart);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                System.out.println(list.get(i));
            }
        }
    }
    static void bfs(int x, int y) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        int count = 1;
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            int curX = temp[0];
            int curY = temp[1];
            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                    continue;
                }
                if (!visited[nextX][nextY] && graph[nextX][nextY] == 1) {
                    queue.add(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    count++;
                }
            }
        }
        list.add(count);
    }
    static void dfs(int x, int y) {
        dfsVisited[x][y] = true;
        dfsCount++;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n){
                continue;
            }
            if (graph[nextX][nextY] == 1 && !dfsVisited[nextX][nextY]) {
                dfs(nextX, nextY);
            }
        }
    }
}
