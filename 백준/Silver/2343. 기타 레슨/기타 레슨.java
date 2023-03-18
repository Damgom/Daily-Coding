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
        int[] bd = new int[n];
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int disk = Integer.parseInt(st.nextToken());
            bd[i] = disk;
            sum += disk;
            max = Math.max(max, disk);
        }
        int left = max;
        int right = sum;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            int curLength = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (curLength + bd[i] > mid) {
                    curLength = 0;
                    count++;
                }
                curLength += bd[i];
            }
            if (curLength != 0) {
                count++;
            }
            if (count <= m) {
                right = mid - 1;
            }else left = mid + 1;
        }
        System.out.println(left);
    }
}