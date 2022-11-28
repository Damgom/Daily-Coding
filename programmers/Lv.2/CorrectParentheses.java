import java.util.ArrayDeque;
import java.util.Deque;

public class CorrectParentheses {
    public static void main(String[] args) {
        System.out.println(solution("(()("));
    }
    public static boolean solution(String s) {
        boolean answer = true;
        Deque<Character> deque = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            if(!deque.isEmpty() && deque.peekLast() == '(' && s.charAt(i) == ')') {
                deque.pollLast();
            }else deque.offerLast(s.charAt(i));
        }
        if(!deque.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}