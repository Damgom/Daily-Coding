import java.util.Arrays;
import java.util.Scanner;

//백준 11651 좌표정렬하기2 실버5
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] arr = new int[N][2];

        for(int i = 0; i < N;i++){
            arr[i][1] = input.nextInt();
            arr[i][0] = input.nextInt();
        }

        Arrays.sort(arr, (o1, o2) ->{
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }
            else return o1[0] - o2[0];
        });

        for(int i = 0; i < N; i++){
            System.out.println(arr[i][1] + " " + arr[i][0]);
        }

    }
}