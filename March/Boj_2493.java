import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj_2493 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2493 탑
         * @stack
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int tower = Integer.parseInt(st.nextToken());
            while (true) {
                if (stack.isEmpty()) {
                    sb.append(0).append(" ");
                    stack.push(tower);
                    indexStack.push(i);
                    break;
                }else {
                    int compare = stack.peek();
                    if (compare > tower) {
                        sb.append(indexStack.peek()).append(" ");
                        stack.push(tower);
                        indexStack.push(i);
                        break;
                    }else {
                        stack.pop();
                        indexStack.pop();
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
