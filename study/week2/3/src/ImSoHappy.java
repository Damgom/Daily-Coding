import java.util.Scanner;

// 백준 14652 나는 행복합니다
public class ImSoHappy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int K = input.nextInt();

        //완전탐색
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(K == count){
                    System.out.println(i +" "+ j);
                }
                count++;
            }
        }
        System.out.println(count);
        // 수학적인방법
        System.out.println(K / M + " " + K % M);
    }
}