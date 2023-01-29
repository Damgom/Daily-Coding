import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class PrinterQueue {
    public static void main(String[] args) {
        int[] prioiries = new int[]{1,1,9,1,1,1};
        int location = 0;
        System.out.println(solution(prioiries, location));
    }
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> priority = new ArrayDeque<>();
        Queue<Integer> docIndex = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            priority.add(priorities[i]);
            docIndex.add(i);
        }
        int count = 1;
        while (!priority.isEmpty() && !docIndex.isEmpty()) {
            int max = Collections.max(priority);
            if (priority.peek() == max) {
                if (docIndex.peek() == location) {
                    answer = count;
                    break;
                }
                priority.poll();
                docIndex.poll();
                count++;
            }else {
                priority.offer(priority.poll());
                docIndex.offer(docIndex.poll());
            }
        }
        return answer;
    }
}