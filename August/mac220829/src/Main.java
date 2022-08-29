import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];
        for(int i = 0; i < T; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for(int i = 0; i < T; i++){
            int q = arr[i] / quarter;
            arr[i] %= quarter;
            int d = arr[i] / dime;
            arr[i] %= dime;
            int n = arr[i] / nickel;
            arr[i] %= nickel;
            int p = arr[i] / penny;

            System.out.println(q + " " + d + " " + n + " " + p);
        }
    }

}