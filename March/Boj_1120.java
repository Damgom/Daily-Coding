import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1120 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_1120 문자열
         * @bruteforce
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String first = st.nextToken();
        String second = st.nextToken();
        int result = first.length();
        for (int i = 0; i < second.length() - first.length() + 1; i++) {
            int temp = 0;
            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) != second.charAt(i + j)) {
                    temp++;
                }
            }
            if (result > temp) {
                result = temp;
            }
        }
        System.out.println(result);
    }
}
