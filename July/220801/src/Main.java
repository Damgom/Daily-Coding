
//프로그래머스 최소직사각형 레벨1
public class Main {
    public static void main(String[] args) {
        int[][] sizes = new int[][]{{60,50},{30,70},{60,30},{80,40}};
        int answer = 0;

        int W = 0;
        int H = 0;
        // 주어진 숫자중 큰 숫자를 가로로 정함(정렬)
        for(int i = 0; i < sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            //그 중 가로와 세로의 최대값을 구한다
            W = Math.max(W, w);
            H = Math.max(H, h);
        }
        System.out.println(W * H);
    }
}