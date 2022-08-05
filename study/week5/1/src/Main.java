import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] result = new double[N];
        for(int i = 0; i < N; i++){
            result[i] = Double.parseDouble(br.readLine()) * 0.8;
            System.out.println("$" + String.format("%.2f", result[i]));
        }
    }
}