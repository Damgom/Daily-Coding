import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            List<Point> list = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                list.add(new Point(x, y));
            }
            if (solve(list)) {
                System.out.println(1);
            }else System.out.println(0);
        }
    }
    static boolean solve(List<Point> list) {
        List<Double> length = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 4; j++) {
                int dx = list.get(j).x - list.get(i).x;
                int dy = list.get(j).y - list.get(i).y;
                length.add(Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)));
            }
        }
        Collections.sort(length);
        for (int i = 0; i < 3; i++) {
            if (!Objects.equals(length.get(i), length.get(i + 1))) {
                return false;
            }
        }
        if (!Objects.equals(length.get(4), length.get(5))) {
            return false;
        }
        return true;
    }
    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
