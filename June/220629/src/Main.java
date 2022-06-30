import java.util.Scanner;
import java.util.Stack;

// 백준 10828 스택 실버4
public class Main {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = input.nextInt();

        for(int i = 0; i < N; i++) {

            String str = input.next();
            switch (str) {
                case "push":
                    int x = input.nextInt();
                    stack.push(x);
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            int tmp = stack.peek();
            stack.pop();
            return tmp;
        }
    }
    public static int size() {
        return stack.size();
    }
    public static int empty() {
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int top() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.peek();
        }
    }
}