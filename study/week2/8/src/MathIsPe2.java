import java.util.Scanner;

//백준 17362 수학은 체육과목입니다
public class MathIsPe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // 8로 나눈 나머지값
        int result = n % 8;

        if(result == 1){
            System.out.println(1);
        }
        else if(result == 0 || result == 2){
            System.out.println(2);
        }
        else if(result == 3 || result == 7){
            System.out.println(3);
        }
        else if(result == 4 || result == 6){
            System.out.println(4);
        }
        else System.out.println(5);
    }
}