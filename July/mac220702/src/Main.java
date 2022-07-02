import java.util.Scanner;

//백준 2231 분해합 브론즈2
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int result = 0;

        //N보다 작은 숫자를 탐색
        for(int i = 0; i < N; i++){
            //분해합을 담을 변수 선언
            int sum = 0;
            //탐색하는 숫자
            int num = i;
            while(num!=0){
                //10으로 나눈 숫자의 나머지를 더한 후 10으로 나눠줌
                //만약 숫자가 10보다 작으면 나머지가 0이되고 num도 0이 되므로
                //반복문 끝
                sum += num % 10;
                num /= 10;
            }
            if(sum + i == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}