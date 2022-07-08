import java.math.BigInteger;
import java.util.Scanner;

//백준 1271 엄청난 부자2
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = input.nextBigInteger();
        BigInteger m = input.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}