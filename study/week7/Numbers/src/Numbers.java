import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        while (true){
            int n = Integer.parseInt(br.readLine());

            if(n == 0) break;

            int n1 = 3 * n;

            if(n1 % 2 == 0){
                int n2 = n1 / 2;
                int n3 = 3 * n2;
                int n4 = n3 / 9;
                System.out.println(count + ". even " + n4);
            }
            if(n1 % 2 != 0){
                int n2 = (n1 + 1) / 2;
                int n3 = 3 * n2;
                int n4 = n3 / 9;
                System.out.println(count + ". odd " + n4);
            }
            count++;
        }
    }
}