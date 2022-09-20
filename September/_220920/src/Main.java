import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int[] arr = new int[10];
        for(int i = 0; i < N.length(); i++){
            arr[N.charAt(i)-'0']++;
        }
        int M = arr[6] + arr[9];
        if(M % 2 == 0) {
            arr[6] = M / 2;
            arr[9] = M / 2;
        } else {
            arr[6] = M / 2 + 1;
            arr[9] = M / 2 + 1;
        }

        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);
    }
}