import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2630 {
    /**
     * @Boj_2630 색종이 만들기
     * @Recursion
     */
    static int[][] board;
    static int blue;
    static int white;
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        countPaper(0, 0, n);
        sb.append(white).append("\n").append(blue);
        System.out.println(sb);
    }
    public static void countPaper(int row, int col, int size) {
        int color = board[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != board[i][j]) {
                    countPaper(row , col, size / 2);
                    countPaper(row, col + size / 2, size / 2);
                    countPaper(row + size / 2, col, size / 2);
                    countPaper(row + size / 2, col + size / 2, size / 2);
                    return;
                }
            }
        }
        if (color == 1) {
            blue++;
        }else white++;
    }
}
