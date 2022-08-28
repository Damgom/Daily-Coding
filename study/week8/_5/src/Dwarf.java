import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Dwarf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        int result1 = 0;
        int result2 = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(sum - arr[i] - arr[j] == 100){
                    result1 = arr[i];
                    result2 = arr[j];
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != result1 && arr[i] != result2){
                System.out.println(arr[i]);
            }
        }
    }
}