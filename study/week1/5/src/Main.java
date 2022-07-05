import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger N = input.nextBigInteger();
        BigInteger M = input.nextBigInteger();

        System.out.println(N.add(M));
    }
}