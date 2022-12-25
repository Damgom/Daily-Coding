import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_1744 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1744 수 묶기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int minus = 0;
        int plus = arr.length-1;
        int sum = 0;
        for (; minus < plus; minus += 2) {
            if(arr[minus] < 1 && arr[minus+1] < 1) {
                sum += arr[minus] * arr[minus+1];
            }else break;
        }
        for (; plus > 0; plus -= 2) {
            if(arr[plus] > 1 && arr[plus-1] > 1) {
                sum += arr[plus] * arr[plus-1];
            }else break;
        }

        for(; plus >= minus; plus--) {
            sum += arr[plus];
        }
        System.out.println(sum);
    }
}