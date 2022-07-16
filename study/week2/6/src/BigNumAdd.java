import java.math.BigInteger;
import java.util.Scanner;

//백준 15740 A+B -9
public class BigNumAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger A = input.nextBigInteger();
        BigInteger B = input.nextBigInteger();

        System.out.println(A.add(B));
    }
}