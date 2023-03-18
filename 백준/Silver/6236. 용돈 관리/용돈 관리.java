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
        int[] money = new int[n];
        int left = Integer.MIN_VALUE;
        int right = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            money[i] = temp;
            right += temp;
            if (temp > left) {
                left = temp;
            }
        }
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            int count = 1;
            int sum = 0;
            for (int i = 0 ; i < n; i++) {
                if (sum + money[i] > mid) {
                    count++;
                    sum = 0;
                }
                sum += money[i];
            }
            if (count > m) {
                left = mid + 1;
            }else right = mid - 1;
        }
        System.out.println(left);
    }
}