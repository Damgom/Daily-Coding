import java.util.Scanner;
import java.util.Stack;

// 백준 10773 제로 실버4 스택
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < K; i++){
            int num = input.nextInt();
            if(num == 0){
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }
        int sum = 0;
        for(int i = 0; i < stack.size(); i++){
            sum += stack.get(i);
        }

        System.out.println(sum);
    }
}