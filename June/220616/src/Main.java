import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double a = 1;
        for(int i = 0; i < 10; i++){
            a = (Math.pow(a, 2) + num) / (2 * a);
        }
        String result = String.format("%.2f",a);
        System.out.println(result);
    }
}