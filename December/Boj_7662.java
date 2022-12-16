import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Boj_7662 {
    public static void main(String[] args) throws IOException {
        /*
        boj_7662 이중 우선순위 큐, treemap, hash, priority queue
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> queue = new TreeMap<>();
            for(int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int n = Integer.parseInt(st.nextToken());
                if(str.equals("I")) {
                    queue.put(n, queue.getOrDefault(n, 0) + 1);
                }else {
                    if(!queue.isEmpty()) {
                        int num = 0;
                        if (n == 1) {
                            num = queue.lastKey();
                        } else num = queue.firstKey();
                        if (queue.put(num, queue.get(num) - 1) == 1) {
                            queue.remove(num);
                        }
                    }
                }
            }
            if(queue.isEmpty()) {
                System.out.println("EMPTY");
            }else System.out.println(queue.lastKey() + " " + queue.firstKey());
        }
    }
}