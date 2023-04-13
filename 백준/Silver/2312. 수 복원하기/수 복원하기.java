import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 2; i <= n; i++) {
                int count = 0;
                while (n % i == 0) {
                    n /= i;
                    count++;
                }
                if (count != 0) {
                    sb.append(i).append(" ").append(count).append("\n");
                }
                if (n == 0) {
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
