import java.io.*;

// 백준 10039 평균 점수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        // 점수가 40점 이하이면 40점으로 치환
        for(int i = 0; i < 5; i++){
            if(arr[i] < 40){
                arr[i] = 40;
            }
        }
        int result = 0;
        for(int i = 0; i < 5; i++){
            result += arr[i];
        }
        bw.write(String.valueOf(result / 5));
        bw.close();
    }
}