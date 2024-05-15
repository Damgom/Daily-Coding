import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, arr[i][j]);
                max = Math.max(max, arr[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int height = 0;
        for(int i = min; i <= max; i++) {
            int time = 0;
            int block = b;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    if(arr[j][k] > i) {
                        time += (arr[j][k] - i) * 2;
                        block += arr[j][k] - i;
                    }else if(arr[j][k] < i) {
                        time += (i - arr[j][k]);
                        block -= (i - arr[j][k]);
                    }
                }
            }
            if(block >= 0 && minTime >= time) {
                minTime = time;
                height = i;
            }
        }
        System.out.println(minTime + " " + height);
    }
}