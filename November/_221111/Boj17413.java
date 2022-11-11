import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj17413 {
    public static void main(String[] args) throws IOException {
        /*
        단어 뒤집기 2
        스택과 조건문들을 활용해 요구사항에 맞는 출력값을 얻는다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> result = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '<') {
                while(!result.isEmpty()) {
                    sb.append(result.pop());
                }
                sb.append(s.charAt(i));
                flag = true;
            }else if(s.charAt(i) == '>') {
                flag = false;
                sb.append(s.charAt(i));
            }else if(s.charAt(i) == ' ') {
                while(!result.isEmpty()) {
                    sb.append(result.pop());
                }
                sb.append(s.charAt(i));
            }else {
                if (!flag) {
                    result.push(s.charAt(i));
                }else {
                    sb.append(s.charAt(i));
                }
                if(s.charAt(i) == ' ') {
                    sb.append(s.charAt(i));
                }
            }
        }
        while(!result.isEmpty()) {
            sb.append(result.pop());
        }
        System.out.println(sb);
    }
}