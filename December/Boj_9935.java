import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_9935 {
    public static void main(String[] args) throws IOException {
        /*
        boj_9935, 문자열 폭발
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String bomb = br.readLine();
//        if (s.contains(bomb)) {
//            s = s.replace(bomb, "");
//        }
//        while (s.contains(bomb)) {
//            s = s.replace(bomb, "");
//        }
//        if (s.length() == 0) {
//            System.out.println("FRULA");
//        } else System.out.println(s);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            stack.push(temp);
            if (stack.size() >= bomb.length()) {
                boolean flag = true;
                for (int j = 0; j < bomb.length(); j++) {
                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    for (int j = 0; j < bomb.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (stack.isEmpty()) {
            sb.append("FRULA");
        }else {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                sb.append(stack.get(i));
            }
        }
        System.out.println(sb);
    }
}