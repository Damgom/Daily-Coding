import java.util.Scanner;

//백준 7569 덩치 실버5
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = input.nextInt();
            arr[i][1] = input.nextInt();
        }

        for(int i = 0; i < N; i++){
            int count = 1;
            for(int j = 0; j < N; j++){
                if(i == j) continue;

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    count++;
                }
            }

            System.out.print(count + " ");
        }
    }
}