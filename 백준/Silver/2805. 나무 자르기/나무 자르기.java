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
        int[] tree = new int[n];
        st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int length = Integer.parseInt(st.nextToken());
            tree[i] = length;
            if (max < length) {
                max = length;
            }
        }
        int left = 0;
        int right = max;
        while (left < right) {
            int mid = (left + right) / 2;
            long temp = 0;
            for (int i = 0; i < tree.length; i++) {
                if (tree[i] >= mid) {
                    temp += tree[i] - mid;
                }
            }
            if (temp < m) {
                right = mid;
            }else left = mid + 1;
        }
        System.out.println(left - 1);
    }
}
