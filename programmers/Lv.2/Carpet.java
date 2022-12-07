import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24, 24)));
    }
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int volume = brown + yellow;

        for (int i = 1; i <= volume; i++) {
            if(volume % i == 0) {
                int row = i;
                int col = volume / i;
                if((row + col - 2) * 2 == brown && col >= row) {
                    answer[0] = col;
                    answer[1] = row;
                    break;
                }
            }
        }
        return answer;
    }
}