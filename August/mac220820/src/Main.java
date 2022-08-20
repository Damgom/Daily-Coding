import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //테스트케이스의 수
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            int count = 0;

            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    count++;
                }
                else {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
    }
}