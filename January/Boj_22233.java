import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj_22233 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_22233 가희와 키워드
         * @DataStructure,Hash
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> keyword = new HashMap<>();
        for (int i = 0; i < n; i++) {
            keyword.put(br.readLine(), 1);
        }
        StringBuilder sb = new StringBuilder();
        int count = n;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), ",");
//            int count = 0;
//            while (st.hasMoreTokens()) {
//                String temp = st.nextToken();
//                if (keyword.containsKey(temp)) {
//                    count += keyword.get(temp);
//                    if (keyword.get(temp) != 0) {
//                        keyword.put(temp, keyword.get(temp) - 1);
//                    }
//                }
//            }
//            n -= count;

            while (st.hasMoreTokens()) {
                String temp = st.nextToken();
                if (keyword.containsKey(temp)) {
                    keyword.remove(temp);
                    count--;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
