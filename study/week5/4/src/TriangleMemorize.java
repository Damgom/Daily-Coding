import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleMemorize {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 세 각을 입력받는다.
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        // 세 각의 합이 180이 아니면 error 출력
        if(A + B + C != 180){
            System.out.println("Error");
        }
        else{
            // A와 B가 같고 B와 C가 같으면
            if(A == B && B == C){
                System.out.println("Equilateral");
            }
            // 두 각의 크기가 같으면
            else if(A == B || B == C || A == C){
                System.out.println("Isosceles");
            }
            // 그 외
            else System.out.println("Scalene");
        }
    }
}