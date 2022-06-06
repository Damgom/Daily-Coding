import java.util.Arrays;
import java.util.Scanner;

// 백준 11399번 GREEDY 문제
// ATM 줄서기

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] time = new int[N];
        for(int i = 0; i < N; i++){
            time[i] = input.nextInt();
        }
        // 최소시간으로 더하기 위해 오름차순으로 정렬
        Arrays.sort(time);
        // 이전 대기시간 합
        int prev = 0;
        // 총 대기시간
        int result = 0;
        for(int i = 0 ; i < time.length; i++){
            // prev의 초기값은 0이고 첫 사람의 대기시간을 더한다
            result += prev + time[i];
            // 이전 대기시간 총합
            prev += time[i];
        }
        System.out.println(result);
    }
}