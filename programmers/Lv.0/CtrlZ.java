import java.util.Stack;

public class CtrlZ {
    public static void main(String[] args) {
        String s = "10 Z 20 Z 1";
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        String[] temp = s.split(" ");
        for(int i = 0; i < temp.length; i++) {
            if(temp[i].equals("Z")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }else stack.push(Integer.parseInt(temp[i]));
        }
        while(!stack.isEmpty()) {
            answer += stack.pop();
        }
        System.out.println(answer);
    }
}