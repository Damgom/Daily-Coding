import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_18310 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_18310 안테나
         * @Greedy,sort
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        int[] house = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
//            house[i] = Integer.parseInt(st.nextToken());
            list.add(Integer.parseInt(st.nextToken()));
        }
//        Arrays.sort(house);
        Collections.sort(list);
//        System.out.println(house[(n - 1) / 2]);
        System.out.println(list.get((n-1) / 2));
    }
}