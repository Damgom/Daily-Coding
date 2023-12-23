import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
            arr[i][n] = arr[n][i] = 'X';
        }
        int row = 0;
        int col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[i][j] == '.' && arr[i][j + 1] == '.' && arr[i][j + 2] == 'X') {
                    row++;
                }
                if (arr[j][i] == '.' && arr[j + 1][i] == '.' && arr[j + 2][i] == 'X') {
                    col++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(row).append(" ").append(col);
        System.out.println(sb);
    }
}