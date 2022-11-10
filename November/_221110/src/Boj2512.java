import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj2512 {
    public static void main(String[] args) throws IOException {
        /*
        정렬 이후 예산 총액을 예산을 요청한 지방 수로 나눔
        가장 적게 요청된 예산보다 나눠진 예산 금액이 크다면 그 수를 빼주고 다시 반복함 (적은 예산을 배정)
        가장 적게 요청된 예산이 나눠진 예산금액보다 컸을 때 그 예산을 줄 수 없다는 것이므로
        남은 예산을 남은 지방수로 나눠줌
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        int m = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int result = 0;
        if(sum > m) {
            for(int i = 0; i < arr.length; i++) {
                if(m / (arr.length-i) > arr[i]) {
                    m -= arr[i];
                }else {
                    result = m / (arr.length-i);
                    break;
                }
            }
        }else {
            result = arr[arr.length-1];
        }

        System.out.println(result);
    }
}