import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long gcd = getGCD(a, b);
        System.out.println(a * b / gcd);
    }
    private static long getGCD(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}