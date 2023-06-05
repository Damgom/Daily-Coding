import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        int count = 1;
        boolean flag = true;
        while (!a.equals(b)) {
            if (b.charAt(b.length()-1) == '1') {
                b = b.substring(0, b.length()-1);
            }else if ((b.charAt(b.length()-1) - '0') % 2 != 0) {
                flag = false;
                break;
            }else {
                b = String.valueOf(Integer.parseInt(b) / 2);
            }
            count++;
            if (Integer.parseInt(b) < Integer.parseInt(a)) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println(count);
        }else System.out.println(-1);
    }
}