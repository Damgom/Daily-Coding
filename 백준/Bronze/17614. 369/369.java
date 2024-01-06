import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String number = Integer.toString(i);
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == '3' || number.charAt(j) == '6' || number.charAt(j) == '9') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}