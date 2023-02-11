import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_2910 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2910 빈도정렬
         * @sort,hash
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            if (!list.contains(temp)) {
                list.add(temp);
            }
        }
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            while (map.get(temp) != 0) {
                sb.append(temp).append(" ");
                map.put(temp, map.get(temp) - 1);
            }
        }
        System.out.println(sb);
    }
}
