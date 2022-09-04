import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            // 공백을 두고 테스트케이스들이 주어짐
            String s = br.readLine();
            int N = Integer.parseInt(br.readLine());
            BigInteger result = new BigInteger("0");
            for(int j = 0; j < N; j++){
                result = result.add(new BigInteger(br.readLine()));
            }
            if(result.remainder(BigInteger.valueOf(N)).compareTo(BigInteger.ZERO) == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}