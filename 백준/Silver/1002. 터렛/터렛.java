import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        boj_1002 터렛

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1= Integer.parseInt(st.nextToken());
            int y1= Integer.parseInt(st.nextToken());
            int r1= Integer.parseInt(st.nextToken());
            int x2= Integer.parseInt(st.nextToken());
            int y2= Integer.parseInt(st.nextToken());
            int r2= Integer.parseInt(st.nextToken());
            System.out.println(circle(x1,y1,r1,x2,y2,r2));
        }
    }
    public static int circle(int x1, int y1, int r1, int x2, int y2, int r2) {
        double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        int result = 0;
        if (distance == 0 && r1 == r2) {
            result = -1;
        } else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) {
            result = 1;
        } else if (distance > r1 + r2 || distance < Math.abs(r1 - r2)) {
            result = 0;
        } else if (distance < r1 + r2) {
            result = 2;
        }
        return result;
    }
}