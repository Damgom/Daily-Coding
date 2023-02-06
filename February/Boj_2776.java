import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj_2776 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_2776 암기왕
         * @BinarySearch
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 0; i < t; i++) {
//            int n = Integer.parseInt(br.readLine());
//            int[] memo = new int[n + 1];
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < n; j++) {
//                memo[j] = Integer.parseInt(st.nextToken());
//            }
//            Arrays.sort(memo);
//            int m = Integer.parseInt(br.readLine());
//            st = new StringTokenizer(br.readLine());
//            StringBuilder sb = new StringBuilder();
//            for (int j = 0; j < m; j++) {
//                int standard = Integer.parseInt(st.nextToken());
//                int start = 0;
//                int end = n;
//                int mid;
//                boolean flag = false;
//                while (start <= end) {
//                    mid = (start + end) / 2;
//                    if (standard == memo[mid]) {
//                        flag = true;
//                        break;
//                    }else if (standard > memo[mid]) {
//                        start = mid + 1;
//                    }else if (standard < memo[mid]) {
//                        end = mid - 1;
//                    }
//                }
//                sb.append(flag ? 1: 0).append("\n");
//            }
//            String result = sb.toString();
//            System.out.println(result);
//        }
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder();
            Set<Integer> set = new HashSet<>();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                set.add(temp);
            }
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (set.contains(temp) && j != m - 1) {
                    sb.append("1").append("\n");
                }else if (!set.contains(temp) && j != m - 1) {
                    sb.append("0").append("\n");
                }else if (set.contains(temp) && j == m - 1) {
                    sb.append("1");
                }else sb.append("0");
            }
            System.out.println(sb);
        }
    }
}