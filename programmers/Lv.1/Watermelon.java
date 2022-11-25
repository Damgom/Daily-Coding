public class Watermelon {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }

    public static String solution(int n) {
        String[] dp = new String[10001];
        dp[1] = "수";
        dp[2] = "수박";
        for(int i = 3; i <= n; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i - 2] + dp[2];
            } else dp[i] = dp[i - 1] + dp[1];
        }
        return dp[n];
    }
}