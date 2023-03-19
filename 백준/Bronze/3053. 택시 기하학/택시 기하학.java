import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double circle = Math.pow(n, 2) * Math.PI;
        double taxi = Math.pow(n, 2) * 2;
        System.out.println(String.format("%.6f", circle));
        System.out.println(String.format("%.6f", taxi));
    }
}