import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        ArrayDeque<Integer>[] deques = new ArrayDeque[n+1];
        for (int i = 0; i <= n; i++) {
            deques[i] = new ArrayDeque<>();
        }
        int count = 0;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int line = Integer.parseInt(st.nextToken());
            int fret = Integer.parseInt(st.nextToken());
            while (!deques[line].isEmpty()) {
                if (deques[line].peek() < fret) {
                    deques[line].push(fret);
                }else if (deques[line].peek() > fret) {
                    deques[line].pop();
                }else break;
                count++;
            }
            if (deques[line].isEmpty()) {
                deques[line].push(fret);
                count++;
            }
        }
        System.out.println(count);
    }
}
