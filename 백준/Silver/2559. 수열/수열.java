import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
//        Queue<Integer> queue = new ArrayDeque<>();
//        st = new StringTokenizer(br.readLine());
//        while(st.hasMoreTokens()) {
//            queue.offer(Integer.parseInt(st.nextToken()));
//            if(queue.size() == k) {
//                max = Math.max(max, queue.stream().mapToInt(o -> o).sum());
//                queue.poll();
//            }
//        }
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <= n-k; i++) {
            int sum = 0;
            for (int j = i; j < i+k; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}