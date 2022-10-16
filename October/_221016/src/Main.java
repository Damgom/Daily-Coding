import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 묘목을 사는날 +1, 나무가 다 자라고 다음날 이장 초대 +1
        int count = 2;
        int result = 0;
        Arrays.sort(arr);

        for(int i = arr.length -1 ; i >= 0; i--) {
            result = Math.max(result, count + arr[i]);
            count++;
        }
        System.out.println(result);
    }
}