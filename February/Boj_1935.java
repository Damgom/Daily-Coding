import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj_1935 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_1935 후위 표기식2
         * @stack
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Deque<Double> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp >= 'A' && temp <= 'Z') {
                deque.push((double) arr[temp - 'A']);
            }else {
                double o1 = deque.pop();
                double o2 = deque.pop();
                double o3 = 0;
                switch (temp) {
                    case '+' :
                        o3 = o2 + o1;
                        break;
                    case '-' :
                        o3 = o2 - o1;
                        break;
                    case '*' :
                        o3 = o2 * o1;
                        break;
                    case '/' :
                        o3 = o2 / o1;
                        break;
                }
                deque.push(o3);
            }
        }
        System.out.printf("%.2f", deque.pop());
    }
}
