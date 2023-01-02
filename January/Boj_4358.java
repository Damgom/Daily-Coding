import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_4358 {
    public static void main(String[] args) throws IOException {
        /*
        boj_4358, 생태학
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        int total = 0;
        while (true) {
            String s = br.readLine();
            if (s == null || s.length() == 0) {
                break;
            }
            total++;
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String tree = entry.getKey();
            list.add(tree);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String tree : list) {
            int count = map.get(tree) * 100;
            sb.append(tree + " " + String.format("%.4f", count / (double) total) + "\n");
        }
        System.out.println(sb);
    }
}