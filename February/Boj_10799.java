import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj_10799 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_10799 쇠막대기
         * @stack
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Deque<Character> deque = new ArrayDeque<>();
        int result = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                deque.push(ch);
                flag = true;
            }else if (ch == ')') {
                deque.pop();
                if (flag) {
                    result += deque.size();
                    flag = false;
                }else result++;
            }
        }
        System.out.println(result);
    }
}
