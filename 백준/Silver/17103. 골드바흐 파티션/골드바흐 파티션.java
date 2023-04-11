import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] prime = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        isPrime();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int temp = Integer.parseInt(br.readLine());
            int result = 0;
            for (int i = 2; i <= temp / 2; i++) {
                if (!prime[i] && !prime[temp - i]) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
    static void isPrime() {
        prime[0] = prime[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!prime[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}
