import java.util.Scanner;

//백준 2869 달팽이 실버5
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int V = input.nextInt();

        int day = (V - B) / (A - B);
        if((V-B)%(A-B) != 0){
            day++;
        }
        System.out.println(day);
    }
}