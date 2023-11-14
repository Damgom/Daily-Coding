import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] prices = new int[m];
        for (int i = 0; i < m; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(prices);
        int maxPrice = 0;
        int revenue = 0;
        for (int i = 0; i < prices.length; i++) {
            int temp = 0;
            if (n > m - i) {
                temp = prices[i] * (m - i);
            } else {
                temp = prices[i] * n;
            }
            if (temp > revenue) {
                revenue = temp;
                maxPrice = prices[i];
            }
        }
        System.out.println(maxPrice + " " + revenue);
    }
}