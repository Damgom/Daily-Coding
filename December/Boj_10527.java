import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Boj_10527 {
    public static void main(String[] args) throws IOException {
        /*
        boj_10527 Judging Troubles, map
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            if(map.containsKey(s)) {
                count++;
                int x = map.get(s);
                if(x == 1) {
                    map.remove(s);
                }else map.put(s, x - 1);
            }
        }
        System.out.println(count);
    }
}