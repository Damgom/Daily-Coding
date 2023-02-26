import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj_3986 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_3986 좋은 단어
         * @stack
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            Deque<Character> stack = new ArrayDeque<>();
            for (int j = 0; j < s.length(); j++) {
                char temp = s.charAt(j);
                if (!stack.isEmpty() && stack.peekLast() == temp) {
                    stack.pollLast();
                }else stack.add(temp);
            }
            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
