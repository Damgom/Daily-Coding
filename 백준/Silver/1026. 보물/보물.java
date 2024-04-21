import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < N; i++){
            arr2[i] = input.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result += (arr[i] * arr2[arr.length - 1 - i]);
        }
        System.out.println(result);
    }
}