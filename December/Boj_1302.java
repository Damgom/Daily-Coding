import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1302 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1302 베스트셀러
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            String temp = br.readLine();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            max = Math.max(max, map.get(temp));
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}