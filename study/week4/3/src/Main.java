import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 모든 가격은 2000원 이하
        int min = 2001;

        for(int i = 0; i < 3; i++){
            int cost = Integer.parseInt(br.readLine());
            if(cost < min){
                min = cost;
            }
        }
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        if(A > B){
            System.out.println(min + B - 50);
        }
        else System.out.println(min + A - 50);

    }
}