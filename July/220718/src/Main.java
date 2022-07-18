import java.util.Scanner;

// 백준 1094 막대기 실버5
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 갖고 싶은 막대의 길이
        int X = input.nextInt();
        // 처음 가지고 있는 막대의 길이
        int N = 64;
        int count = 0;
        // 갖고싶은 막대의 길이가 64일 때 count 출력
        while(X > 0){
            if(N > X){
                N /= 2;
            }
            else{
                count++;
                X -= N;
            }
        }
        System.out.println(count);
    }
}