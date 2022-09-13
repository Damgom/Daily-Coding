import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long N = 1;
        /*
         * 1부터 하나씩 더해가며 빼준다
         * 남아있는 S보다 N이 더 커지면 멈추고 남아있는 마지막 숫자가 뺄 수 있는 제일 큰 수이다.
         * 예를들어 S를 20으로 두면 1 + 2 + 3 + 4 + 5 + 6 = 21이 되는데 1을 제외하면 2, 3, 4, 5, 6 으로 5개가 된다
         * 즉 N에서 1을 뺀 숫자를 출력하면 서로 다른 자연수 N을 구할 수 있다.
         */
        while(true){
            if(S >= N){
                S -= N;
            }
            else break;
            N++;
        }
        System.out.println(--N);
    }
}