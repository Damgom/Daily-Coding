import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean flag = false;
        int start = 0;
        int end = 1000;
        for (int i = 0; i < s; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == n) {
                flag = true;
            }
            if (num < n && start < num) {
                start = num;
            }
            if (num > n && end > num) {
                end = num;
            }
        }
        int result = 0;
        if (flag) {
            System.out.println(0);
        } else {
            for (int i = (start + 1); i <= n; i++) {
                for (int j = n; j < end; j++) {
                    result++;
                }
            }
            System.out.println(result - 1);
        }

    }
}