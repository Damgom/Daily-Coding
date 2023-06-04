import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        boj_1629 실버1 분할정복
        일반적인 반복문으로 풀면 시간초과나옴
        pow(a,n)-> n = 0 1
                -> n = 짝수면 pow(a,n/2) ^2
                -> n = 홀수면 pow(a,n/2) ^2 * a
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(calculate(a, b, c) % c);
    }

    public static long calculate(long a, long b, long c) {
        if(b == 0) {
            return 1;
        }else if(b == 1) {
            return a;
        }else if(b % 2 == 0) {
            long n = calculate(a, b/2, c) % c;
            return (n * n) % c;
        }else {
            long n = calculate(a, b/2, c) % c;
            return (((n * n) % c) * a) % c;
        }
    }
}