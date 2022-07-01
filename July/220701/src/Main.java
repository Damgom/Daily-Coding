import java.util.Arrays;
import java.util.Scanner;

//백준 10816 숫자카드2 실버4
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
            int key = input.nextInt();
            sb.append(upperBound(arr,key) - lowerBound(arr,key)).append(' ');
        }
        System.out.println(sb);
    }
    public static int lowerBound(int[] arr, int key){
        int low = 0;
        int high = arr.length;
        while (low < high){
            int mid = (low + high) / 2;

            if(key <= arr[mid]){
                high = mid;
            }
            else low = mid + 1;
        }
        return low;
    }
    public static int upperBound(int[] arr, int key){
        int low = 0;
        int high = arr.length;
        while(low < high){
            int mid = (low + high) / 2;
            if(key < arr[mid]){
                high = mid;
            }
            else low = mid + 1;
        }
        return low;
    }
}