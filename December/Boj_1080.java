import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1080 {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        /*
        boj_1080, 행렬
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }
        }
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < m; j++) {
                arr2[i][j] = temp.charAt(j) - '0';
            }
        }
        int count = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < m-2; j++) {
                if (arr[i][j] != arr2[i][j]) {
                    count++;
                    transfer(i, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != arr2[i][j]) {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }
        System.out.println(count);

    }
    public static void transfer(int a, int b) {
        for (int i = a; i < a+3; i++) {
            for (int j = b; j < b+3; j++) {
                arr[i][j] = 1 - arr[i][j];
            }
        }
    }
}