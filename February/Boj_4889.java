import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj_4889 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_4889 안정적인 문자열
         * @String,Stack,Greedy
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        while (true) {
            String s = br.readLine();
            if (s.charAt(0) == '-') {
                break;
            }
            int count = 0;
            int answer = 0;
            Deque<Character> deque = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{') {
                    deque.add(s.charAt(i));
                }else {
                    if (deque.isEmpty()) {
                        count++;
                        deque.add('{');
                    }else {
                        deque.pop();
                    }
                }
            }
            answer += count + deque.size() / 2;
            result += answer + " ";
        }
        StringTokenizer st = new StringTokenizer(result);
        int num = 1;
        while (st.hasMoreTokens()) {
            System.out.println(num + ". " + st.nextToken());
            num++;
        }
    }
}