import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = 0;
        int setMin = Integer.MAX_VALUE;
        int oneMin = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int set = Integer.parseInt(st.nextToken());
            int one = Integer.parseInt(st.nextToken());
            if(set < setMin) {
                setMin = set;
            }
            if(one < oneMin) {
                oneMin = one;
            }
        }
        result = Math.min(((n / 6)+1) * setMin, n * oneMin);
        result = Math.min(result, (n / 6) * setMin + (n % 6) * oneMin);
        System.out.println(result);
    }
}