import java.util.Scanner;

// 백준 2775 부녀회장이 될테야 브론즈1
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[][] arr = new int[15][15];

        for(int i = 0 ; i < 15; i++){
            arr[i][1] = 1;
            arr[0][i] = i;
        }

        for(int i = 1; i < 15; i++){
            for(int j = 2; j < 15; j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }

        for(int i = 0; i < T; i++){
            int k = input.nextInt();
            int n = input.nextInt();
            System.out.println(arr[k][n]);
        }
    }
}