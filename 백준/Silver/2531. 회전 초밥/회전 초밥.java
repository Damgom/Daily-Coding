import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] sushi = new int[n];
        for (int i = 0; i < n; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }
        boolean[] eat;
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int tempCount = 0;
            eat = new boolean[d+1];
            for (int j = 0; j < k; j++) {
                int temp = i + j;
                if (temp >= n) {
                    temp -= n;
                }
                if (eat[sushi[temp]]) {
                    continue;
                }
                eat[sushi[temp]] = true;
                tempCount++;
            }
            if (!eat[c]) {
                tempCount++;
            }
            count = Math.max(count, tempCount);
        }
        System.out.println(count);
    }
}
