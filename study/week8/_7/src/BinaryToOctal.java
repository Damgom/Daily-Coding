import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToOctal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        /*
         * 2진수를 8진수로 표현해보기
         * 000 -> 0
         * 001 -> 1
         * 010 -> 2
         * 011 -> 3
         * 100 -> 4
         * 101 -> 5
         * 110 -> 6
         * 111 -> 7
         * 1000 -> 1 0
         * 1001 -> 1 1
         * 1010 -> 1 2
         * 1011 -> 1 3
         * 1100 -> 1 4
         * 1101 -> 1 5
         * 1110 -> 1 6
         * 1111 -> 1 7
         * 11001100 -> 314*/

        StringBuilder result = new StringBuilder();
        if(s.length() % 3 == 1){
            result.append(s.charAt(0));
        }
        if(s.length() % 3 == 2){
            result.append((s.charAt(0)-'0') * 2 + (s.charAt(1)-'0'));
        }

        for(int i = s.length() % 3; i < s.length(); i+=3){
            result.append(((s.charAt(i)-'0') * 4) + ((s.charAt(i + 1)-'0') * 2) + (s.charAt(i + 2)-'0'));
        }

        System.out.println(result);
    }
}