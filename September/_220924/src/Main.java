import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 배열의 길이를 n+1로 하는경우 초기 저장하는 값보다 작은 수가 들어오는 경우 outofbounds
        // 그러므로 입력조건에 있는 100000을 이용한다
        int[] dp = new int[100001];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[2] = 1;
        dp[4] = 2;
        dp[5] = 1;

        for(int i = 6; i <= n; i++) {
            dp[i] = Math.min(dp[i-2], dp[i-5]) + 1;
            // 동전의 개수는 i-2원을 거슬러줄수있는 동전조합에 2원짜리 추가 또는 i-5원 조합에 5원짜리 1개 추가
        }
        // 만약 MAX_VALUE값이 바뀌지 않는 경우 조합할 수 있는 경우의수가 없으므로 -1 출력
        if(dp[n] == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(dp[n]);
    }
}