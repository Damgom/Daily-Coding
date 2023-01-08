import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_2257 {
    public static void main(String[] args) throws IOException {
        /*
        boj_2257 화학식량
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'H') {
                stack.push(1);
            } else if (arr[i] == 'C') {
                stack.push(12);
            } else if (arr[i] == 'O') {
                stack.push(16);
            } else if (arr[i] >= '2' && arr[i] <= '9') {
                stack.push(stack.pop() * (arr[i] - '0'));
            } else if (arr[i] == ')') {
                int temp = 0;
                while (true) {
                    if (stack.peek() == 0) {
                        stack.pop();
                        stack.push(temp);
                        break;
                    }
                    temp += stack.pop();
                }
            } else if (arr[i] == '(') {
                stack.push(0);
            }
        }
        int answer = 0;
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        System.out.println(answer);
    }
}