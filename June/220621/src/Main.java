import java.util.Scanner;

// 백준 1978 소수찾기 실버5
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 0;


        for(int i = 0; i < N; i++){
            int num = input.nextInt();
            boolean isPrime = true;

            if(num == 1) continue;
            for(int j = 2; j <= Math.sqrt(num); j++){
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println(count);
    }
}

