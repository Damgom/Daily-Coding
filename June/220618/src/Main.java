import java.util.Arrays;
import java.util.Scanner;

// 백준 11650 좌표정렬하기 실버5
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            arr[i][0] = input.nextInt();
            arr[i][1] = input.nextInt();
        }
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]){
                return e1[1] - e2[1];
            }
            else {
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}