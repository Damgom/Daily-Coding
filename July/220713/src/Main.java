import java.util.Arrays;
import java.util.Scanner;

// 백준 2108 통계학 실버3
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        // 산술평균
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(Math.round(sum / N));

        //중앙값
        System.out.println(arr[ (N - 1) / 2]);

        //최빈값
        int count = 0;
        int max = -1;
        int mode = arr[0];
        boolean result = false;
        //최빈값 구하는 반복문
        for(int i = 0; i < N - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            }else {
                count = 0;
            }
            if(max < count) {
                max = count;
                mode = arr[i];
                result = true;
            }else if(max == count && result == true) {
                mode = arr[i];
                result = false;
            }
        }
        System.out.println(mode);
        //범위
        System.out.println(arr[N-1] - arr[0]);
    }
}