import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Memento {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            queue.add(i);
        }

        int count = 0;
        int num = 1;
        int round = 1;
        while(queue.size() != 1){
            count++;

            if(count != num){
                queue.add(queue.poll());
            }
            else{
                queue.poll();
                round++;
                num = (int) (Math.pow(round, 3) % queue.size());
                if(num == 0) num = queue.size();
                count = 0;
            }
        }
        System.out.println(queue.poll());
    }
}