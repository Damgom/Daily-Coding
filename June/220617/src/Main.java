import java.util.Scanner;

// 백준 1929번 소수구하기
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();

        boolean[] arr = new boolean[N+1];
        arr[1] = true;
        for(int i = 2; i <= N; i++){
            for(int j = 2; i*j <= N; j++){
                arr[i*j] = true;
            }
        }
        for(int k = M; k <= N; k++){
            if(!arr[k]){
                System.out.println(k);
            }
        }
    }
}