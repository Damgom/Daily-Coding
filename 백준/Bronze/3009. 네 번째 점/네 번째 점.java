import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            x[i] = a;
            y[i] = b;
        }
        System.out.println(solve(x) + " " + solve(y));
    }
    static int solve(int[] arr) {
        if (arr[0] == arr[2]) {
            return arr[1];
        }else if (arr[0] == arr[1]) {
            return arr[2];
        }else return arr[0];
    }
}