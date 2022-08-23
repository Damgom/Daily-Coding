import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int change = 1000 - N;
        int[] money = new int[]{500, 100, 50, 10, 5, 1};
        int count = 0;
        for(int i = 0; i < money.length; i++){
            count += change / money[i];
            change = change % money[i];

        }
        System.out.println(count);
    }
}