import java.util.Scanner;

//백준 1010 다리놓기 실버5
public class Main {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();

        for(int i = 0; i < A; i++){
            int N = input.nextInt();
            int R = input.nextInt();
            System.out.println(combination(R, N));
        }
    }
    public static int combination(int n, int r){
        // 시간초과
//        if(n == r || r == 0){
//            return 1;
//        }
//
//        return combination(n-1, r-1) + combination(n -1, r);

        if(n == r || r == 0){
            return dp[n][r] = 1;
        }

        if(dp[n][r] > 0){
            return dp[n][r];
        }

        return dp[n][r] = combination(n-1, r-1) + combination(n -1, r);
    }
}