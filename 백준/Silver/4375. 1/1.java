import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int num = Integer.parseInt(s);
            System.out.println(solve(num));
        }
    }
    static int solve(int n) {
        int temp = 1;
        int count = 1;
        while (temp % n != 0) {
            temp = (temp * 10 + 1) % n;
            count++;
        }
        return count;
    }
}