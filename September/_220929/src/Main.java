import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String result = "";
        String[] dp = new String[16];
        for(int i = 0; i < A.length(); i++) {
            result += A.charAt(i);
            result += B.charAt(i);
        }
        while(result.length() > 2) {
            String temp = "";
            for(int i = 0; i < result.length()-1; i++) {
                int n = Character.getNumericValue(result.charAt(i)) + Character.getNumericValue(result.charAt(i+1));
                temp += Integer.toString(n%10);
            }
            result = temp;
        }
        System.out.println(result);
    }
}