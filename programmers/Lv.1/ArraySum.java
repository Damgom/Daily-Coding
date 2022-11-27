import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{1, 2},{3, 4}}, new int[][]{{1, 2},{3, 4}})));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}