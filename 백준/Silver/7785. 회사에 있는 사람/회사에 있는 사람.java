import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();

            if (result.containsKey(key)) {
                result.remove(key);
            } else {
                result.put(key, value);
            }
        }
        List<String> keyList = new ArrayList<>(result.keySet());
        keyList.sort(Collections.reverseOrder());
        for(int i = 0; i < keyList.size(); i++) {
            System.out.println(keyList.get(i));
        }
    }
}