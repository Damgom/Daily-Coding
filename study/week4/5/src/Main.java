import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        String s = br.readLine();
        br.close();
        StringTokenizer st = new StringTokenizer(s);

        for(int i = 0; i < 7; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

         Arrays.sort(arr);

//        int temp = 0;
//        if(arr[0] > arr[1]){
//            temp = arr[0];
//            arr[0] = arr[1];
//            arr[1] = temp;
//        }
//        if(arr[1] > arr[2]){
//            temp = arr[1];
//            arr[1] = arr[2];
//            arr[2] = temp;
//
//            if(arr[0] > arr[1]){
//                temp = arr[0];
//                arr[0] = arr[1];
//                arr[1] = temp;
//            }
//        }
//        Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // arr[j+1] 과 arr[j]의 자리 바꾸기
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
//
//        for(int i = 0; i < 3; i++){
//            System.out.print(arr[i] + " ");
//        }
    }
}