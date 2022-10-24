    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.HashMap;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            HashMap<Long, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                Long num = Long.parseLong(br.readLine());
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            ArrayList<Integer> values = new ArrayList<>(map.values());
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < values.size(); i++) {
                if(values.get(i) > max) {
                    max = values.get(i);
                }
            }
            ArrayList<Long> result = new ArrayList<>();
            for(Long key : map.keySet()) {
                if(map.get(key) == max) {
                    result.add(key);
                }
            }
            Collections.sort(result);
            System.out.println(result.get(0));
        }
    }