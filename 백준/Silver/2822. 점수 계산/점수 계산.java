import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Problem> list = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            list.add(new Problem(Integer.parseInt(br.readLine()), i));
        }
        list.sort((o1, o2) -> o2.score - o1.score);
        int sum = 0;
        List<Integer> problemNumber = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Problem problem = list.get(i);
            sum += problem.score;
            problemNumber.add(problem.number);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(problemNumber);
        for (int i = 0; i < problemNumber.size(); i++) {
            sb.append(problemNumber.get(i)).append(" ");
        }
        System.out.println(sum);
        System.out.println(sb);
    }

    public static class Problem {
        int score;
        int number;

        public Problem(int score, int number) {
            this.score = score;
            this.number = number;
        }
    }
}