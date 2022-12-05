import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj_15828 {
    public static void main(String[] args) throws IOException {
        /*
        boj_15828 Router, 큐
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> router = new LinkedList<>();
        while(true) {
            int packet = Integer.parseInt(br.readLine());
            if (packet == -1) {
                break;
            }
            if (packet == 0) {
                router.poll();
            }else if (router.size() < n) {
                router.offer(packet);
            }
        }
        int size = router.size();
        if(size == 0) {
            System.out.println("empty");
        }else {
            for(int i = 0; i < size; i++) {
                System.out.print(router.poll() + " ");
            }
        }
    }
}