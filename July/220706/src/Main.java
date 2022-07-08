import java.util.Scanner;
import java.util.Stack;

//백준 1874 스택 수열 실버2
public class Main {
    static int temp = 1;
    static boolean result = false;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        // 첫줄에 들어가는 숫자(숫자의 개수)
        int N = input.nextInt();
        // N개의 숫자가 들어감
        for(int i = 0; i < N; i++) {
            int T = input.nextInt();
            // 초기값은 필요없음, temp = 1이고 T와 같을 때까지 +를 sb에 넣어줌
            for (; temp <= T; temp++) {
                stack.push(temp);
                sb.append("+").append("\n");
            }
            // stack의 마지막을 peek해서 T와 같으면 pop하고 -를 sb에 넣어줌
            if(stack.peek() == T){
                stack.pop();
                sb.append("-").append("\n");
            }
            else result = true;
        }
        if(result){
            System.out.println("NO");
        }
        else System.out.println(sb);
    }
}