import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        char[] arr = name.toCharArray();
        Arrays.sort(arr);
        StringBuilder front = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        StringBuilder rear = new StringBuilder();
        Queue<Character> queue = new ArrayDeque<>();
        for (char c : arr) {
            queue.offer(c);
        }
        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                mid.append(queue.poll());
                break;
            }
            char temp = queue.poll();
            if (temp == queue.peek()) {
                front.append(temp);
                rear.append(queue.poll());
            }else if (temp != queue.peek()) {
                mid.append(temp);
            }
        }
        if (mid.length() > 1) {
            System.out.println("I'm Sorry Hansoo");
        }else System.out.println(front.append(mid).append(rear.reverse()));
    }
}
