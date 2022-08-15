import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Sign {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //3번 반복
        for(int i = 0; i < 3; i++){
            //각 테스트 케이스의 수
            int N = Integer.parseInt(br.readLine());

            BigInteger result = new BigInteger("0");
            for(int j = 0; j < N; j++){
                BigInteger num = new BigInteger(br.readLine());
                result = result.add(num);
            }

            if(result.compareTo(BigInteger.ZERO) == -1) System.out.println("-");
            else if(result.compareTo(BigInteger.ZERO) == 1) System.out.println("+");
            else System.out.println(0);
        }
    }
}