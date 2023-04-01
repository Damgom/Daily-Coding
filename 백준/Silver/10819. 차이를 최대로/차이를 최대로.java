import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visit;
    static int[] num;
    static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visit = new boolean[n];
        num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);
        System.out.println(answer);
    }
    static void dfs(int index) {
        if (index == n) {
            answer = Math.max(answer, sum());
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                num[index] = arr[i];
                dfs(index + 1);
                visit[i] = false;
            }
        }
    }
    static int sum() {
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum += Math.abs(num[i] - num[i+1]);
        }
        return sum;
    }
}
