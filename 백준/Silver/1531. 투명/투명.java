import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] image = new int[101][101];
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int leftX = Integer.parseInt(st.nextToken());
            int leftY = Integer.parseInt(st.nextToken());
            int rightX = Integer.parseInt(st.nextToken());
            int rightY = Integer.parseInt(st.nextToken());
            for (int i = leftX; i <= rightX; i++) {
                for (int j = leftY; j <= rightY; j++) {
                    image[i][j]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] > m) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}