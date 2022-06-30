import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(bubbleSort(new int[]{2, 3, 4, 1, 7, 8})));
    }
    public static int[] bubbleSort(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            boolean swapped = false;
            for(int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}