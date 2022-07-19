import java.util.Scanner;

//백준 2960 에라토스테네스의 체 실버4
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        boolean[] oddNum = new boolean[N+1];
        int count = 0;

        for(int i = 2; i <= N; i++){
            for(int j = i; j <= N; j += i){
                if(!oddNum[j]){
                    count++;
                    oddNum[j] = true;
                }

                if(count == K){
                    System.out.println(j);
                    //
                    System.exit(0);
                }
            }
        }
    }
}