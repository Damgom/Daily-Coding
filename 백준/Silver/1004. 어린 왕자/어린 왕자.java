import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int startX;
    static int startY;
    static int endX;
    static int endY;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                if (checkDistance(x, y, r)) count++;
            }
            System.out.println(count);
        }
    }
    static boolean checkDistance(int x, int y, int r) {
        boolean startContainCircle = Math.sqrt(Math.pow(x - startX, 2) + Math.pow(y - startY, 2)) < r;
        boolean endContainCircle = Math.sqrt(Math.pow(x - endX, 2) + Math.pow(y - endY, 2)) < r;
        return (!startContainCircle || !endContainCircle) && (startContainCircle || endContainCircle);
    }
}