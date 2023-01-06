import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1051 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1051 숫자 정사각형
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] rectangle = new int[n][m];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < temp.length(); j++) {
                rectangle[i][j] = temp.charAt(j) - '0';
            }
        }
        int length = Math.min(n, m);
        while (length > 1) {
            boolean flag = false;
            for (int i = 0; i <= n - length; i++) {
                for (int j = 0; j <= m - length; j++) {
                    int temp = rectangle[i][j];
                    if (temp == rectangle[i][j+length-1] && temp == rectangle[i+length-1][j] && temp == rectangle[i+length-1][j+length-1]) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag) {
                break;
            }else {
                length--;
            }
        }
        System.out.println(length * length);
    }
}