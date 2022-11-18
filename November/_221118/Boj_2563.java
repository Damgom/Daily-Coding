import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2563 {
    public static void main(String[] args) throws IOException {
        /*
        색종이, 실버5
        좌표를 1칸씩 나눠 생각하고 2차원배열에서 색종이가 붙은 영역을 1로 채워나간 후 1의 개수를 세는방식으로 구현
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[100][100];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    board[j][k] = 1;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}