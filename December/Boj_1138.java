import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_1138 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1138 한줄로 서기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] left = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            left[i] = Integer.parseInt(st.nextToken());
        }
        List<Integer> result = new ArrayList<>();
        for(int i = left.length-1; i >= 0; i--) {
            result.add(left[i], i+1);
        }
        for(int i = 0; i < n; i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}