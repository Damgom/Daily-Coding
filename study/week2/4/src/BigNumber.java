import java.util.Scanner;

// 백준 14928 큰 수
public class BigNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 시간초과
//        BigInteger N = input.nextBigInteger();
//        BigInteger M = BigInteger.valueOf(20000303);
//
//        System.out.println(N.remainder(M));
        String N = input.next();
        long result = 0;
        for(int i = 0; i < N.length(); i++){
            // result 에 10씩 곱하면서 결과값에 더해줌 ( 자리수 올려주기)
            // 12345를 예로 들면 i=0일때 0 * 10 + 1 = 1
            // i = 1일 때 1 * 10 + 2 = 12
            // i = 2일 때 12 * 10 + 3 = 123
            result = (result * 10 + (N.charAt(i) - '0')) % 20000303;
        }
        System.out.println(result);
    }
}