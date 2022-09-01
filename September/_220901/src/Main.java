import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 2702 초6 수학
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = GCD(a, b);
            System.out.print(a * b / result + " ");
            System.out.println(result);
        }
    }
    public static int GCD(int a, int b){
        if(a % b == 0){
            return b;
        }
        return GCD(b, a % b);
    }
}