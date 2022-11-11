import java.util.Arrays;

public class CharactersCoordinate {
    public static void main(String[] args) {
        String[] keyinput = new String[]{"left", "right", "up", "right", "right"};
        int[] board = new int[]{11,11};
        int xMax = (board[0] - 1) / 2;
        int xMin = ((board[0] - 1) / 2) * -1;
        int yMax = (board[1] - 1) / 2;
        int yMin = ((board[1] - 1) / 2) * -1;

        int[] answer = new int[2];
        for(int i = 0; i < keyinput.length; i++) {
            String temp = keyinput[i];
            if(temp.equals("left")){
                if(answer[0] > xMin) {
                    answer[0]--;
                }
            }
            if(temp.equals("right")) {
                if(answer[0] < xMax) {
                    answer[0]++;
                }
            }
            if(temp.equals("up")) {
                if(answer[1] < yMax) {
                    answer[1]++;
                }
            }
            if(temp.equals("down")) {
                if(answer[1] > yMin) {
                    answer[1]--;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}