import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1500 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1500 최대 곱
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long answer = 1;
        int div = s / k;
        int mod = s % k;
        for (int i = 0; i < k; i++) {
            if (i < mod) {
                answer *= (div + 1);
            }else answer *= div;
        }
        System.out.println(answer);
    }
}