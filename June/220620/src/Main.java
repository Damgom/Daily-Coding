import java.util.Scanner;

// 백준 2805 나무자르기 이분탐색 실버2
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] arr= new int[N];
        int max = 0;
        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int min = 0;
        while(min < max) {
            long sum = 0;
            int mid = (min + max) / 2;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] - mid >= 0) {
                    sum += arr[i] - mid;
                }
            }
            if(sum < M){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}