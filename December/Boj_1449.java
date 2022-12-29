import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1449 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1449, 수리공 항승
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        /*
        틀린코드
         */
//        int tape = l;
//        for (int i = 0; i < arr.length-1; i++) {
//            int temp = Math.abs(arr[i+1] - arr[i]);
//            if (temp < tape) {
//                tape -= temp;
//            }else {
//                count++;
//                tape = l;
//            }
//        }
        Arrays.sort(arr);
        double tapeStart = arr[0] - 0.5;
        int count = 1;
        for (int tape : arr) {
            if (tapeStart + l < tape) {
                count++;
                tapeStart = tape - 0.5;
            }
        }
        System.out.println(count);
    }
}