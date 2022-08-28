import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mosquito {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        while((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int M = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            for (int j = 0; j < N; j++) {
                int m = M;
                M = P / S;
                P = L / R;
                L = m * E;
            }
            System.out.println(M);
        }
    }
}