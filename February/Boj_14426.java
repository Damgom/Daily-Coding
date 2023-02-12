import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14426 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_14426 접두사 찾기
         * @String
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] standard = new String[n];
        for (int i = 0; i < n; i++) {
            standard[i] = br.readLine();
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            String temp = br.readLine();
            for (int j = 0; j < n; j++) {
//                if (temp.equals(standard[j].substring(0, temp.length()))) {
//                    count++;
//                    break;
//                }
                if (standard[j].startsWith(temp)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
