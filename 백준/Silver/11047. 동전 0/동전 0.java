import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> coin = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            coin.add(m);
        }
        Collections.sort(coin, Collections.reverseOrder());
        int count = 0;
        for(int i = 0; i < coin.size(); i++) {
            if(k > 0) {
                int temp = k / coin.get(i);
                count += temp;
                k -= coin.get(i) * temp;
            }
        }
        System.out.println(count);
    }
}