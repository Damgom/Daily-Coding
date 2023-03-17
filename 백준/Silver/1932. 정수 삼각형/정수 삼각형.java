import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                triangle[i] = new int[j];
            }
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length - 1; j++) {
                triangle[i][j] = Math.max(triangle[i+1][j] + triangle[i][j], triangle[i+1][j+1] + triangle[i][j]);
            }
        }
        System.out.println(triangle[0][0]);
    }
}
