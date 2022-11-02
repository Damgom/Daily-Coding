import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int pow = 1;
        int num = 10;
        for(int i = 1; i <= n; i++) {
            if(i % num == 0) {
                pow++;
                num *= 10;
            }
            count += pow;
        }
        System.out.println(count);
    }
}