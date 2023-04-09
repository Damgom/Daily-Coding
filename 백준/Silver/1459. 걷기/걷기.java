import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long s = Long.parseLong(st.nextToken());
        long result = (x + y) * w;
        long result2;
        if ((x + y) % 2 == 0) {
            result2 = Math.max(x, y) * s;
        }else result2 = (Math.max(x, y) - 1) * s + w;
        long result3 = Math.min(x, y) * s + Math.abs(x - y) * w;
        System.out.println(Math.min(result, Math.min(result2, result3)));
    }
}
