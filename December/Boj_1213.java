import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Boj_1213 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1213 팰린드롬 만들기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder front = new StringBuilder();
        StringBuilder rear = new StringBuilder();
        String mid = "";
        Queue<Character> queue = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        while(!queue.isEmpty()) {
            if(queue.size() == 1) {
                mid += queue.poll();
                break;
            }
            char temp = queue.poll();
            if(temp == queue.peek()) {
                front.append(temp);
                rear.append(queue.poll());
            }else if(temp != queue.peek()) {
                mid += temp;
            }
        }
        if(mid.length() > 1) {
            System.out.println("I'm Sorry Hansoo");
        }else {
            front.append(mid).append(rear.reverse());
            System.out.println(front);
        }
    }
}