import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][4];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1].equals(o2[1])) {
                if (o1[2].equals(o2[2])) {
                    if (o1[3].equals(o2[3])) {
                        return o1[0].compareTo(o2[0]);
                    }
                    return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                }
                return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
            }
            return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
        });
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0]);
        }
//        Map<String, int[]> map = new HashMap<>();
//        while (n-- > 0) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            String name = st.nextToken();
//            int[] score = new int[3];
//            for (int i = 0; i < 3; i++) {
//                score[i] = Integer.parseInt(st.nextToken());
//            }
//            map.put(name, score);
//        }
//        List<String> list = new ArrayList<>(map.keySet());
//        list.sort((o1, o2) -> {
//            if (map.get(o1)[0] == map.get(o2)[0]) {
//                if (map.get(o1)[1] == map.get(o2)[1]) {
//                    if (map.get(o1)[2] == map.get(o2)[2]) {
//                        return o1.compareTo(o2);
//                    }return map.get(o2)[2] - map.get(o1)[2];
//                }return map.get(o1)[1] - map.get(o2)[1];
//            }return map.get(o2)[0] - map.get(o1)[0];
//        });
//        for (String s : list) {
//            System.out.println(s);
//        }
    }
}
