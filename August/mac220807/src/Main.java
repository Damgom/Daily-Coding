import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 1009 분산처리
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //테스트케이스 T
        int T = Integer.parseInt(br.readLine());
        //입력값 저장 할 배열
        String[] testCase = new String[T];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < T; i++){
            testCase[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(testCase[i]);
            result.append(calculate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))+"\n");
        }
        //10대의 컴퓨터로 연산을 하기 때문에 마지막 데이터는 10으로 나눴을때의 나머지값과 같다.
        System.out.println(result);
    }

    public static int calculate(int A, int B){
        int result = 1;
        for(int i = 0; i < B; i++){
            result = (result * A) % 10;
            if(result == 0) result = 10;
        }
        return result;
    }
}