import java.util.Arrays;
import java.util.Scanner;

// 백준 11047
// 동전개수를 최소한으로 사용해서 금액을 만드는 문제
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 코인 몇개 사용하는지 카운트
        int count = 0;
        // N을 입력
        int N = input.nextInt();
        // K를 입력
        int K = input.nextInt();
        // 크기 N인 배열 선언하고 coin값 입력
        int[] coin = new int[N];
        for(int i=0; i<N; i++){
            coin[i] = input.nextInt();
        }
        // 배열을 오름차순으로 정렬
        Arrays.sort(coin);
        // 금액을 코인으로 나누고 뒷부분을 버림 -> 동전의 개수
        // 동전의 개수 * 코인을 금액에서 빼주고 반복문을 돈다
        for(int i = coin.length - 1; i >= 0; i--){
            if(K > 0){
                int num = (int)Math.floor((double)K / coin[i]);
                count += num;
                K -= coin[i] * num;
            }
        }
        System.out.println(count);
    }
}