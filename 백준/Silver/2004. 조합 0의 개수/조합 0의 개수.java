import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long countFive = powFive(n) - powFive(n - m) - powFive(m);
        long countTwo = powTwo(n) - powTwo(n - m) - powTwo(m);
        System.out.println(Math.min(countFive, countTwo));
    }
    static long powFive(long num) {
        int count = 0;
        while (num >= 5) {
            count += num / 5;
            num /= 5;
        }
        return count;
    }
    static long powTwo(long num) {
        int count = 0;
        while (num >= 2) {
            count += num / 2;
            num /= 2;
        }
        return count;
    }
}
