import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준 11866 요세푸스 0 실버5
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while(queue.size() > 1){
            for(int i = 0; i < K-1; i++){
                int val = queue.poll();
                queue.offer(val);
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append('>');
        System.out.println(sb);
    }
}