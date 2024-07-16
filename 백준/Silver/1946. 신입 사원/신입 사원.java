import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            for(int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[j][0] = a;
                arr[j][1] = b;
            }
            Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
            int count = 1;
            int compare = arr[0][1];
            for(int j = 1; j < n; j++) {
                if(arr[j][1] < compare) {
                    compare = arr[j][1];
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}