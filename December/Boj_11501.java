import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11501 {
    public static void main(String[] args) throws IOException {
        /*
        boj_11501, 주식 greedy
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            long sum = 0;
            int max = 0;
            for (int j = arr.length-1; j >= 0; j--) {
                if(arr[j] > max) {
                    max = arr[j];
                }else {
                    sum += max - arr[j];
                }
            }
            System.out.println(sum);
        }
    }
}