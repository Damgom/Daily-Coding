public class LongJump {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }
    public static long solution(int n) {
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= 2000; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }
}
