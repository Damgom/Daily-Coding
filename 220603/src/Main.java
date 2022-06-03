import java.util.*;

// 3장의 카드를 뽑고 적힌 숫자들의 합으로 만들 수 있는 소수의 개수를 구함
public class Main {
    public static void main(String[] args) {
        // 임의의 카드를 입력
        int[] cards = new int[]{2,3,4,8,13};
        // 소수를 셀 count 선언
        int count = 0;
        // 3장의 카드를 중복없이 뽑음 5C3
        for(int i = 0; i < cards.length; i++){
            for(int j = i + 1; j < cards.length; j++){
                for(int k = j + 1; k < cards.length; k++){
                    int num = cards[i] + cards[j] + cards[k];
                    //소수판별함수
                    if(isPrime(num)) count++; // 소수일때 카운트+1
                }
            }
        }
        System.out.println(count);
    }

    //소수판별법
    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
