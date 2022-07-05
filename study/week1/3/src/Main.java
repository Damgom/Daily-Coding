import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 를 사용하는 방법
        Scanner input = new Scanner(System.in);
        BigInteger N = input.nextBigInteger();
        BigInteger M = input.nextBigInteger();
        System.out.println(N.add(M));
        System.out.println(N.subtract(M));
        System.out.println(N.multiply(M));
    }
}