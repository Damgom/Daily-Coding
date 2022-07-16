import java.util.Scanner;

// 백준 15727 조별과제
public class FindLeader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        if(L % 5 == 0){
            System.out.println(L / 5);
        }
        else System.out.println((L / 5) + 1);
    }
}