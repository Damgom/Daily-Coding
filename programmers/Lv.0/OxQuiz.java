import java.util.Arrays;

public class OxQuiz {
    public static void main(String[] args) {
        String[] quiz = new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int result = Integer.parseInt(temp[4]);
            if(temp[1].equals("-")) {
                if(Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]) == result) {
                    answer[i] = "O";
                }else answer[i] = "X";
            }else if(temp[1].equals("+")) {
                if(Integer.parseInt(temp[2]) + Integer.parseInt(temp[0]) == result) {
                    answer[i] = "O";
                }else answer[i] = "X";
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}