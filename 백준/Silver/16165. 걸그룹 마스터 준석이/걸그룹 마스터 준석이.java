import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, List<String>> group = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String groupName = br.readLine();
            int num = Integer.parseInt(br.readLine());
            List<String> memberList = new ArrayList<>();
            for (int j = 0; j < num ; j++) {
                String member = br.readLine();
                memberList.add(member);
            }
            group.put(groupName, memberList);
        }
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                List<String> list = group.get(str);
                Collections.sort(list);
                for (String s : list) {
                    System.out.println(s);
                }
            }else {
                for (String key : group.keySet()) {
                    if (group.get(key).contains(str)) {
                        System.out.println(key);
                    }
                }
            }
        }
    }
}
