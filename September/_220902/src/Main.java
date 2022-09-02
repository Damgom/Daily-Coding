import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 3; j++){
                boolean flag = false;
                for(int k = 0; k < N; k++){
                    // i == k 일 때 자기 자신과 비교해서 모든 결과값이 0이 된다
                    if(i == k) continue;
                    if(arr[i][j] == arr[k][j]){
                        arr[k][j] = 0;
                        flag = true;
                    }
                }
                if(flag){
                    arr[i][j] = 0;
                }
            }
            System.out.println(arr[i][0] + arr[i][1] + arr[i][2]);
        }
    }
}