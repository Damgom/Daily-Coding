import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Boj_1715 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1715 카드 정렬하기, greedy sort
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }
        int sum = 0;
        while (queue.size() > 1) {
            int firstElement = queue.poll();
            int secondElement = queue.poll();
            int temp = firstElement + secondElement;
            sum += temp;
            queue.add(temp);
        }
        System.out.println(sum);
    }
}