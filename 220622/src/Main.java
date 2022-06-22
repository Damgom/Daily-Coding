import java.util.Arrays;
import java.util.Scanner;

// 백준 1920 이분탐색 실버4
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = input.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        int M = input.nextInt();

        for(int i = 0; i < M; i++){
            if((binarySearch(arr, input.nextInt()) >= 0)){
                sb.append(1).append('\n');
            }
            else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static int binarySearch(int[] arr, int key){

        int low = 0;
        int hi = arr.length - 1;

        while(low <= hi){
            int mid = (low + hi) / 2;

            if(key < arr[mid]){
                hi = mid - 1;
            }
            else if(key > arr[mid]){
                low = mid + 1;
            }
            else return mid;
        }
        return -1;
    }
}