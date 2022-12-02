import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1002 {
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
        /*
        2점이 만날 때 : 두 점 사이의 거리(distance)가 두 원의 반지름의 합(r1 + r2) 보다 작을 때
        1점이 만날 때 : 외적, 내적
        만나지 않을 때 : 두 점 사이의 거리(distance)가 두 원의 반지름의 합(r1 + r2) 보다 크거나,
                      두 원의 반지름 중 작은 반지름의 길이와 두 점 사이의 거리의 합이 긴 반지름의 길이보다 작을 때
        만나는 점의 개수가 무한일 떄 : 위치와 반지름의 길이가 같을 때
         */
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