import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    Integer front = queue.peek();
                    if(front == null) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(front).append('\n');
                    }break;
                case "back":
                    Integer back = queue.peekLast();
                    if(back == null) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(back).append('\n');
                    }break;
                case "pop":
                    Integer pop = queue.poll();
                    if(pop == null) {
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(pop).append('\n');
                    }break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if(queue.isEmpty()) {
                        sb.append(1).append('\n');
                    }else {
                        sb.append(0).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
