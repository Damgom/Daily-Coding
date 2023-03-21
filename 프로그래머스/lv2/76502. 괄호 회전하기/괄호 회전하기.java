import java.util.Stack;

class Solution {
    public int solution(String s) {
        int count = 0;
        String temp = s;
        for (int i = 0; i < s.length(); i++) {
            temp = temp.substring(1, s.length()) + temp.charAt(0);
            if(check(temp)) {
                count++;
            }
        }
        return count;
    }
    static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(temp);
            }else {
                if (temp == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }else stack.push(temp);
                }else if (temp == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else stack.push(temp);
                }else if (temp == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else stack.push(temp);
                }else stack.push(temp);
            }
        }
        return stack.isEmpty();
    }
}