import java.util.Scanner;

public class rectangleExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,w,h;
        x = input.nextInt();
        y = input.nextInt();
        w = input.nextInt();
        h = input.nextInt();
        // x축 끝점까지의 거리 = x 혹은 w-x
        // y축 끝점까지의 거리 = y 혹은 h-y
        // 둘 중 4개의 수 중 가장 작은수를 출력
        int x_min = Math.min(x, w-x);	// x축 최소거리
        int y_min = Math.min(y, h-y);	// y축 최소거리

        // x와 y축 최소거리 중 가장 작은 값
        System.out.println(Math.min(x_min, y_min));
    }
}