import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class HallOfFame {
    public static void main(String[] args)  {
        System.out.println(Arrays.toString(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }
    public static int[] solution(int k, int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();
        if(k < score.length) {
            for (int i = 0; i < k; i++) {
                queue.add(score[i]);
                result.add(queue.peek());
            }

            for (int i = k; i < score.length; i++) {
                if (!queue.isEmpty() && queue.peek() < score[i]) {
                    queue.poll();
                    queue.add(score[i]);
                }
                result.add(queue.peek());
            }
        }else {
            for(int i = 0; i < score.length; i++) {
                queue.add(score[i]);
                result.add(queue.peek());
            }
        }
        return result.stream().mapToInt(n -> n).toArray();
//        int[] answer = new int[score.length];
//        for(int i = 0; i < score.length; i++) {
//            queue.add(score[i]);
//            if(queue.size() > k) {
//                queue.poll();
//            }
//            answer[i] = queue.peek();
//        }
//        return answer;
    }
}