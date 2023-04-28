import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] prime = new boolean[1_000_001];
        isPrime(prime);
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            boolean flag = false;
            for (int i = 2; i <= n / 2; i++) {
                if (!prime[i] && !prime[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
    static void isPrime(boolean[] arr) {
        arr[0] = arr[1] = true;
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = i + i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }
    }
}
