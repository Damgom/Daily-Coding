import java.util.Scanner;

// 백준 1654 이분탐색 실버2
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        int N = input.nextInt();
        int[] arr = new int[K];
        long max = 0;
        for(int i = 0; i < K; i++){
            arr[i] = input.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }
        long min = 0;
        long mid = 0;

        while(min < max){
            mid = (min + max) / 2;
            long count = 0;

            for(int i = 0; i < arr.length; i++){
                count += (arr[i] / mid);
            }
            if(count < N){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}