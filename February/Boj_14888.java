import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14888 {
    /**
     * @Boj_14888 연산자 끼워넣기
     * @BruteForce,BackTracking
     */
    static int n;
    static int[] operator;
    static int[] number;
    static int max;
    static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        number = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
        operator = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        dfs(number[0], 1);
        System.out.println(max);
        System.out.println(min);
    }
    public static void dfs(int num, int start) {
        if (start == n) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;
                if (i == 0) {
                    dfs(num + number[start], start + 1);
                }else if (i == 1) {
                    dfs(num  - number[start], start + 1);
                }else if (i == 2) {
                    dfs(num * number[start], start + 1);
                }else {
                    dfs(num / number[start], start + 1);
                }
                operator[i]++;
            }
        }
    }
}