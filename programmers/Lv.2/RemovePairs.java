import java.util.ArrayDeque;
import java.util.Deque;

public class RemovePairs {
    public static void main(String[] args) {
        System.out.println(solution("cdcd"));
    }
    public static int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        deque.offerLast(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(!deque.isEmpty() && deque.peekLast() == arr[i]) {
                deque.pollLast();
            }else deque.offerLast(arr[i]);
        }
        if(deque.isEmpty()) answer = 1;
        return answer;
    }
}