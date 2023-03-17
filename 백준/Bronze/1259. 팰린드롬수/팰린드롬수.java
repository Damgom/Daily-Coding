import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }else {
                String temp = Integer.toString(num);
                String result = "yes";
                for (int i = 0; i < temp.length() / 2; i++) {
                    if (temp.charAt(i) != temp.charAt(temp.length() -1 - i)) {
                        result = "no";
                        break;
                    }
                }
                System.out.println(result);
            }
        }
    }
}