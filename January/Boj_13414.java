import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_13414 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_13414 수강신청
         * @Hash,LinkedHashSet,DataStucture
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < l; i++) {
//            String student = br.readLine();
//            if (list.contains(student)) {
//                list.remove(student);
//                list.add(student);
//            }else {
//                list.add(student);
//            }
//        }
//        for (int i = 0; i < k; i++) {
//            System.out.println(list.get(i));
//        }
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < l; i++) {
            String student = br.readLine();
            set.remove(student);
            set.add(student);
        }
        int count = 0;
        for (String s : set) {
            count++;
            System.out.println(s);
            if (count == k) {
                break;
            }
        }
    }
}
