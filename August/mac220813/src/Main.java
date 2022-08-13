import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        /*8진수를 2진수로 표현하면
        0 -> 000
        1 -> 001
        2 -> 010
        3 -> 011
        4 -> 100
        5 -> 101
        6 -> 110
        7 -> 111
        10(8) -> 1 + 0 -> 001000 -> 1000
        11(9) -> 1 + 1 -> 001001 -> 1001
        예제의 314 -> 3 + 1 + 4 -> 011 001 100 -> 11001100 이다.
        즉, n.chatAt(i) -'0' 로 각 자리에 맞는 이진수값을 문자열에 더해주면 된다.
        단, 수가 0인경우를 제외하고는 반드시 1로 시작해야 한다.
         */
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n.length(); i++){
            String result = Integer.toBinaryString(n.charAt(i) - '0');
            if(result.length() == 2 && i != 0){
                result = "0" + result;
            }
            else if(result.length() == 1 && i != 0){
                result = "00" + result;
            }
            sb.append(result);
        }
        System.out.println(sb);
    }
}