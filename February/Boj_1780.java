import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1780 {
    /**
     * @Boj_1780 종이의 개수
     * @recursion
     */
    static int[][] paper;
    static int n, zeroCount, minusCount, oneCount;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        paper = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solution(0, 0, n);
        StringBuilder sb = new StringBuilder();
        sb.append(minusCount).append("\n").append(zeroCount).append("\n").append(oneCount);
        System.out.println(sb);
    }
    public static void solution(int row, int col, int size) {
        int color = paper[row][col];
        int newSize = size / 3;
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != paper[i][j]) {
                    solution(row, col, newSize);
                    solution(row, col + newSize, newSize);
                    solution(row, col + 2 * newSize, newSize);
                    solution(row + newSize, col, newSize);
                    solution(row + newSize, col + newSize, newSize);
                    solution(row + newSize, col + 2 * newSize, newSize);
                    solution(row + 2 * newSize, col, newSize);
                    solution(row + 2 * newSize, col + newSize, newSize);
                    solution(row + 2 * newSize, col + 2 * newSize, newSize);
                    return;
                }
            }
        }
        if (color == -1) {
            minusCount++;
        }else if (color == 0) {
            zeroCount++;
        }else oneCount++;
    }
}
