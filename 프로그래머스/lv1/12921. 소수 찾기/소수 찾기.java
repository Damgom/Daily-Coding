class Solution {
    public int solution(int n) {
        boolean[] check = new boolean[n+1];
        check[1] = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; i * j <= n; j++) {
                check[i * j] = true;
            }
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!check[i]) {
                count++;
            }
        }
        return count;
    }
}