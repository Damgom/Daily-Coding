class Solution {
    static boolean[] visit;
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }
    void dfs(int tired, int[][] dungeons, int depth) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visit[i] || dungeons[i][0] > tired) {
                continue;
            }
            visit[i] = true;
            dfs(tired - dungeons[i][1], dungeons, depth + 1);
            visit[i] = false;
        }
        answer = Math.max(answer, depth);
    }
}