import java.util.Scanner;

//프로그래머스 나머지가 1이 되는 수 찾기 레벨1
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i < n+1; i++){
            if(n % i == 1){
                System.out.println(i);
                break;
            }
        }
    }
}