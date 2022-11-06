import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2003 {
    public static void main(String[] args) throws IOException {
        /*
        완전탐색, 투포인터를 이용한 문제
        구간합이 원하는 값보다 크면 start index 값을 빼주고 start index 를 +1
        구간합이 원하는 값보다 작으면 end index 값을 더해주고 end index 를 +1
        원하는값과 구간합이 같을 때 count +1
        end index 가 n 과 같으면 반복문을 종료하고 count 값을 출력한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int sum = 0;
        int start = 0;
        int end = 0;

        while(true) {
            if(sum >= m) {
                sum -= arr[start];
                start++;
            }else if(end == n) {
                break;
            }else {
                sum += arr[end];
                end++;
            }
            if(sum == m) {
                count++;
            }
        }
        System.out.println(count);
    }
}