import java.util.Scanner;

//백준 1676 팩토리얼 0의 개수
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 0;

        // 팩토리얼값을 나열해보면 5의 배수마다 0의 개수가 증가한다

        while(N >= 5){
            count += N / 5;
            N /= 5;
        }
        System.out.println(count);
    }
}