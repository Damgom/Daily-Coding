import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_15565 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_15565 귀여운 라이언
         * @TwoPointer,SlidingWindow
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> ryan = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int doll = Integer.parseInt(st.nextToken());
            if (doll == 1) {
                ryan.add(i);
            }
        }
        if (ryan.size() < k) {
            System.out.println(-1);
            return;
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < ryan.size() - k + 1; i++) {
            int temp = ryan.get(i + k - 1) - ryan.get(i) + 1;
            answer = Math.min(answer, temp);
        }
        System.out.println(answer);
    }
}
/**
 * @다른풀이
 *         int L = 0;
 *         int R = 1;
 *         int count = arr[0];
 *         int answer = Integer.MAX_VALUE;
 *         while(R < N && L < N){
 *             if(count >= M){
 *                 count -= arr[L];
 *                 L++;
 *                 while(arr[L] == 0){
 *                     L++;
 *                 }
 *             }else{
 *                 count += arr[R];
 *                 R++;
 *             }
 *             if(count == M){
 *                 answer = Math.min(answer, R - L);
 *             }
 *
 *         }
 *         if(answer == Integer.MAX_VALUE) answer = -1;
 *         System.out.println(answer);
 */
//10 3
//1 2 2 2 1 2 1 2 2 1
//0 4 6 9
