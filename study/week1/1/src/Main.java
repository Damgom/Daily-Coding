import java.util.Scanner;

// 백준 1550번 16진수
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String N = input.next();
        System.out.println(Integer.parseInt(N, 16));
    }
}