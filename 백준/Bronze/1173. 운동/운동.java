import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int wantToExercisingTime = Integer.parseInt(st.nextToken());
        int curPulse = Integer.parseInt(st.nextToken());
        int limitPulse = Integer.parseInt(st.nextToken());
        int increasePulse = Integer.parseInt(st.nextToken());
        int decreasePulse = Integer.parseInt(st.nextToken());

        int timeSpentExercising = 0;
        int timeSpent = 0;
        int initPulse = curPulse;
        while (timeSpentExercising != wantToExercisingTime) {
            int temp = curPulse + increasePulse;
            if (temp > limitPulse) {
                curPulse -= decreasePulse;
                if (curPulse < initPulse) {
                    curPulse = initPulse;
                }
            } else {
                curPulse += increasePulse;
                timeSpentExercising++;
            }
            timeSpent++;
            if((curPulse + increasePulse > limitPulse) && (curPulse == initPulse)) {
                break;
            }
        }
        if (timeSpentExercising != wantToExercisingTime) {
            System.out.println(-1);
            return;
        }
        System.out.println(timeSpent);
    }
}