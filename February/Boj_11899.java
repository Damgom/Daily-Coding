import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj_11899 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_11899 괄호 끼워넣기
         * @stack
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Deque<Character> stack = new ArrayDeque<>();
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(') {
                stack.add(temp);
            }else if (temp == ')'){
                if (stack.isEmpty()) {
                    answer++;
                }else {
                    stack.pop();
                }
            }
        }
        answer += stack.size();
        System.out.println(answer);
    }
}
