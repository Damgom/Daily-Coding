import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_1205 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1205 등수 구하기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int newScore = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        List<Integer> score = new ArrayList<>();
        int answer = 0;
        if (n != 0) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                score.add(Integer.parseInt(st.nextToken()));
            }
            if (newScore <= score.get(score.size()-1) && score.size() == p) {
                answer = -1;
            }else {
                int rank = 1;
                for (int i = 0; i < score.size(); i++) {
                    if(newScore < score.get(i)) {
                        rank++;
                    }else break;
                }
                answer = rank;
            }
        }else {
            answer = 1;
        }
        System.out.println(answer);
    }
}