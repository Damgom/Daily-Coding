import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1107 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1107 리모컨
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int broken = Integer.parseInt(br.readLine());
        boolean[] button = new boolean[10];
        if (broken != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < broken; i++) {
                int temp = Integer.parseInt(st.nextToken());
                button[temp] = true;
            }
        }
        int answer = Math.abs(100 - n);
        for (int i = 0; i <= 999999; i++) {
            String s = String.valueOf(i);
            int length = s.length();
            boolean isBreak = false;
            // 고장난 버튼을 눌러야 하는지 검사
            for (int j = 0; j < length; j++) {
                if (button[s.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                int min = Math.abs(n - i) + length;
                answer = Math.min(min, answer);
            }
        }
        System.out.println(answer);
    }
}