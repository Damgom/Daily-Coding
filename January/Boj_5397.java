import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj_5397 {
    /**
     * @Boj_5397 키로거
     * @Implementation,String,Stack
     */
    static StringBuilder result = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            solution(s);
        }
        System.out.println(result);
    }
    public static void solution(String key) {
        char[] arr = key.toCharArray();
        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();
        for (char temp : arr) {
            switch (temp) {
                case '<':
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;
                case '>':
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;
                case '-':
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                default:
                    left.push(temp);
            }
        }
        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        while (!right.isEmpty()) {
            result.append(right.pollFirst());
        }
        result.append("\n");
    }
}
