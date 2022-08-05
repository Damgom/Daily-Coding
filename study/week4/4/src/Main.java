import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i = 0; i < 5; i++){
            if(N == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}