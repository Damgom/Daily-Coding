import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DislikeSameNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
    public static int[] solution(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(deque.peekLast() != arr[i]) {
                deque.add(arr[i]);
            }
            System.out.println(deque);
        }
        int[] answer = new int[deque.size()];
        int size = deque.size();
        for(int i = 0; i < size; i++) {
            answer[i] = deque.pollFirst();
        }
        return answer;
    }
}