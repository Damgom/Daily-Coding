import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 시간 초과
//        st = new StringTokenizer(br.readLine());
//        int[] arr = new int[N];
//        for(int i = 0; i < N; i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        for(int i = 0; i < M; i++){
//            int sum = 0;
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            for(int j = a; j <= b; j++){
//                sum += arr[j-1];
//            }
//            System.out.println(sum);
//        }
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N+1];
        // 부분합을 미리 넣어두고 뽑아쓰는 형식
        for(int i = 1; i <= N; i++){
            arr[i] = arr[i-1]+ Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(arr[b] - arr[a-1]);
        }
    }
}