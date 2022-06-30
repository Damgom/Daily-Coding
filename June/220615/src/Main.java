import java.util.Arrays;
import java.util.Scanner;

//백준 1546 사칙연산 브론즈1
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            num[i] = input.nextInt();
        }
        // 배열을 정렬
        Arrays.sort(num);
        // 배열의 마지막요소 num[num.length-1]은 최대값
        // 입력받은 숫자의 합
        // 소수점까지 보기 위해 double로 변수 선언
        double sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        double avg = (sum / num[num.length-1] * 100) / N;
        System.out.println(avg);
    }
}