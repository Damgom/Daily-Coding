import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 2217 로프 그리디
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        /*
        모든 로프를 사용할 필요는 없다
        가장 큰 무게를 버티는 로프부터 2개씩 병렬연결 했을 때
        가장 많이 버티는 경우를 구한다
         */
        Arrays.sort(arr);

        int max = 0;
        for(int i = arr.length-1; i >= 0; i--){
            arr[i] = arr[i] * (N - i);
            if(max < arr[i]) max = arr[i];
        }
        System.out.println(max);
    }
}