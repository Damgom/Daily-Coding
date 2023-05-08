import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int start = 0;
        while (true) {
            int temp = n - getSum(l - 1);
            if (temp < 0 || l > 100) {
                System.out.println(-1);
                return;
            }
            if (temp % l == 0) {
                start = temp / l;
                break;
            }else {
                l++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < start + l; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
    static int getSum(int num) {
        int sum = num * (num + 1);
        return sum / 2;
    }
}