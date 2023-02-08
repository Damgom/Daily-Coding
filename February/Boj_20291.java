import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_20291 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_20291 파일 정리
         * @hash,string
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        Map<String, Integer> extension = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
//            st.nextToken();
//            String temp = st.nextToken();
//            extension.put(temp, extension.getOrDefault(temp, 0) + 1);
//        }
//        List<String> result = new ArrayList<>(extension.keySet());
//        Collections.sort(result);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < result.size(); i++) {
//            String temp = result.get(i);
//            sb.append(temp).append(" ").append(extension.get(temp)).append("\n");
//        }
//        System.out.println(sb);
        Map<String, Integer> extension = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String temp = st.nextToken();
            extension.put(temp, extension.getOrDefault(temp, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (String key : extension.keySet()) {
            sb.append(key).append(" ").append(extension.get(key)).append("\n");
        }
        System.out.println(sb);
    }
}
