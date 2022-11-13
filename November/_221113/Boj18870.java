import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj18870 {
    public static void main(String[] args) throws IOException {
        /*
        18870 좌표 압축
        순위나누기, 좌표정렬
        낮은 숫자를 기준으로 순위를 매긴다
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] sortedArr = new int[n];
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
            sortedArr[i] = a;
        }
        Arrays.sort(sortedArr);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for(int i = 0; i < sortedArr.length; i++) {
            if(!map.containsKey(sortedArr[i])) {
                map.put(sortedArr[i], rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length-1; i++) {
            sb.append(map.get(arr[i])).append(' ');
        }
        sb.append(map.get(arr[arr.length-1]));
        System.out.println(sb);
    }
}