import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        long sumA = 0;
        long sumB = 0;
        for (int i = 0; i < n-1; i++) {
            sumA += x[i] * y[i+1];
            sumB += y[i] * x[i+1];
        }
        sumB += x[0] * y[n-1];
        sumA += y[0] * x[n-1];
        System.out.println(String.format("%.1f", (Math.abs(sumA - sumB) / 2.0)));
    }
}