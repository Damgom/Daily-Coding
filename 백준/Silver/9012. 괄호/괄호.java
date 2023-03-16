import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String parenthesis = br.readLine();
            checkParenthesis(parenthesis);
        }
        System.out.println(sb);
    }

    public static void checkParenthesis(String parenthesis) {
        int count = 0;
        for(int i = 0; i < parenthesis.length(); i++) {
            if(parenthesis.charAt(i) == '(') {
                count++;
            }else count--;
            if(count < 0) {
                break;
            }
        }
        if(count == 0) {
            sb.append("YES").append("\n");
        }else sb.append("NO").append("\n");
    }
}