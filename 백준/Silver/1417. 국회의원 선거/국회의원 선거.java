import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i < n; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }
        int result = 0;
        while (!queue.isEmpty() && queue.peek() >= dasom++) {
            result++;
            queue.add(queue.poll() - 1);
        }
        System.out.println(result);
    }
}