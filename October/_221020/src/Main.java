import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a == 0) {
                if(queue.isEmpty()) {
                    result.add(0);
                }else {
                    result.add(queue.poll());
                }
            }else {
                queue.add(a);
            }
        }
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}