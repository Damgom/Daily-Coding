import java.util.*;

public class FeatureDev {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1,1,1,1,1,1})));
    }
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < progresses.length; i++) {
            int temp = (100 - progresses[i]);
            if(temp % speeds[i] != 0) {
                queue.offer(temp / speeds[i] + 1);
            }else queue.offer(temp / speeds[i]);
        }
        List<Integer> result = new ArrayList<>();
        int count = 1;
        int first = queue.poll();
        while(!queue.isEmpty()) {
            if(queue.peek() <= first) {
                queue.poll();
                count++;
            }else {
                first = queue.poll();
                result.add(count);
                count = 1;
            }
        }
        result.add(count);
        return result.stream().mapToInt(n -> n).toArray();
    }
}