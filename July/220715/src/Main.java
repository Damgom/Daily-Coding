import java.util.Scanner;

// 백준 2163 초콜릿 자르기 브론즈1
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        //쪼개는 횟수
        int count = 0;

        //몇 개 예제를 그려보니 답은 그냥 N*M-1번 나옴

        System.out.println(N * M - 1);

    }
}