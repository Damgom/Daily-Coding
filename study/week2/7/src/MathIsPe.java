import java.math.BigInteger;
import java.util.Scanner;

// 백준15894 수학은 체육과목 입니다
public class MathIsPe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        System.out.println(n * 4);
        // 입력조건 10^9까지
        BigInteger n = input.nextBigInteger();
        System.out.println(n.multiply(BigInteger.valueOf(4)));
    }
}