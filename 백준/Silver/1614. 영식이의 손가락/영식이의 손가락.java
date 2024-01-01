import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hurt = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        long result = 0;
        if (hurt == 1) {
            result = count * 8L;
        } else if(hurt == 2) {
            result = (1 + (count / 2) * 8L + (count % 2) * 6);
        }else if(hurt == 3) {
            result = (2 + (count / 2) * 8L + (count % 2) * 4);
        } else if(hurt == 4) {
            result = (3 + (count / 2) * 8L + (count % 2) * 2);
        } else {
            result = (4 + count * 8L);
        }
        System.out.println(result);
    }
}
