import java.util.Arrays;

public class SafetyZone {
    public static void main(String[] args) {
        int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    if(i >= 1 && board[i-1][j] == 0 ) {
                        board[i-1][j] = 2;
                    }
                    if( j >= 1 && board[i][j-1] == 0) {
                        board[i][j-1] = 2;
                    }
                    if(i >= 1 && j >= 1 && board[i-1][j-1] == 0) {
                        board[i-1][j-1] = 2;
                    }
                    if(i <= board.length-2 && board[i+1][j] == 0) {
                        board[i+1][j] = 2;
                    }
                    if(j <= board.length-2 && board[i][j+1] == 0) {
                        board[i][j+1] = 2;
                    }
                    if(i <= board.length-2 && j <= board.length-2 && board[i+1][j+1] == 0 ) {
                        board[i+1][j+1] = 2;
                    }
                    if(i >= 1 && j <= board.length-2 && board[i-1][j+1] == 0) {
                        board[i-1][j+1] = 2;
                    }
                    if(j >= 1 && i <= board.length-2 && board[i+1][j-1] == 0) {
                        board[i+1][j-1] = 2;
                    }
                }
            }
        }
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.deepToString(board));
    }
}