import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj_19583 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_19583 싸이버개강총회
         * @hash, String
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String e = st.nextToken();
        String q = st.nextToken();
        Set<String> start = new HashSet<>();
        Set<String> end = new HashSet<>();
        String temp;
        while ((temp = br.readLine()) != null) {
            String[] arr = temp.split(" ");
            String time = arr[0];
            String name = arr[1];
            if (s.compareTo(time) >= 0) {
                start.add(name);
            }else if (e.compareTo(time) <= 0 && q.compareTo(time) >= 0) {
                end.add(name);
            }
        }
        int count = 0;
        for (String str : end) {
            if (start.contains(str)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
