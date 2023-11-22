import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Long, Integer> map = new HashMap<>();
            double average = (double) Integer.parseInt(st.nextToken()) / 2;
            boolean flag = false;
            while (st.hasMoreTokens()) {
                long soldier = Long.parseLong(st.nextToken());
                map.put(soldier, map.getOrDefault(soldier, 0) + 1);
            }
            for (Long key : map.keySet()) {
                if (map.get(key) > average) {
                    sb.append(key).append("\n");
                    flag = true;
                }
            }
            if (!flag) {
                sb.append("SYJKGW").append("\n");
            }
        }
        System.out.println(sb);
    }
}