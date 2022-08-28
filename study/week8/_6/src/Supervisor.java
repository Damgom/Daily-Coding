import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Supervisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] exam = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            exam[i] = Integer.parseInt(st.nextToken());
        }
        int[] supervisor = new int[2];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 2; i++){
            supervisor[i] = Integer.parseInt(st.nextToken());
        }

        // 총감독관은 시험장의 수와 같음 이후 부감독관을 구해서 더함
        long result = N;

        for(int i = 0; i < N; i++){
            exam[i] -= supervisor[0];
            if(exam[i] <= 0) continue;
            result += exam[i] / supervisor[1];
            if(exam[i] % supervisor[1] != 0){
                result++;
            }
        }


        System.out.println(result);

    }
}