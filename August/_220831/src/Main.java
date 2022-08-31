import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int start = 0;
        int result = 0;
        for(int i = 0; i < 10; i++){
            int N = Integer.parseInt(br.readLine());
            if(start < 100){
                start += N;
                if(Math.abs(result - 100) > Math.abs(start - 100)){
                    result = start;
                }else if(Math.abs(result - 100) == Math.abs(start-100)){
                    result = Math.max(result, start);
                }
            }
        }
        System.out.println(result);
    }
}