import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HolidayTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        // 국어A 하루에 풀수있는 양 C
        // 수학B 하루에 풀수있는 양 D

        int m = 0;
        int n = 0;

        if(A % C == 0){
            m = A / C;
        }
        else if(A % C != 0){
            m = A / C + 1;
        }

        if(B % D == 0){
            n = B / D;
        }
        else if(B % D != 0){
            n = B / D + 1;
        }

        if(m > n) System.out.println(L - m);
        else System.out.println(L - n);
    }
}