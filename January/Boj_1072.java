import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1072 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1072 게
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long z = y * 100 / x;
        /*
        시간초과
         */
//        long expect = z + 1;
//        int answer = 0;
//        if (x == y) {
//            answer = -1;
//        } else {
//            while (z != expect) {
//                x += 1;
//                y += 1;
//                z = y * 100 / x;
//                answer ++;
//            }
//        }
//        System.out.println(answer);
        long answer = 0;
        if (z >= 99) {
            answer = -1;
        } else {
            long start = 1;
            long end = x;
            while (start < end) {
                long mid = (start + end) / 2;
                long cur_x = x + mid;
                long cur_y = y + mid;
                long cur_rate = cur_y * 100 / cur_x;
                if (cur_rate > z) {
                    end = mid;
                }else {
                    start = mid + 1;
                }
            }
            answer = end;
        }
        System.out.println(answer);
    }
}