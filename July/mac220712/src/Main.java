import java.util.Scanner;

//백준 2292 벌집 브론즈2
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        // 최단거리
        int count = 1;
        int cur = 2;
        //N이 1일때는 최소값 1
        if(N == 1){
            System.out.println(1);
        }
        else{
            while(cur <= N){
                cur = cur + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}