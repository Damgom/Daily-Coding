import java.math.BigInteger;
import java.util.Scanner;

// 백준 13277 큰 수 곱셈
public class BigNumMultiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger A = input.nextBigInteger();
        BigInteger B = input.nextBigInteger();

        System.out.println(A.multiply(B));
    }
}