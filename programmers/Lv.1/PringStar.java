import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PringStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                sb.append('*');
            }
            System.out.println(sb);
            sb = new StringBuilder();
        }
    }
}