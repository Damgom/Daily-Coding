import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        // 빼야하는 수는 어차피 같음 (k가 3이면 0, 1, 2를 더한 수만큼 빼주면됨)
        int substractNum = (k - 1) * k / 2;
        int sum = 0;
        for (int i = arr.length - 1; k > 0; i--, k--) {
            sum += arr[i];
        }
        System.out.println(sum - substractNum);
    }
}