import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1783 {
    public static void main(String[] args) throws IOException {
        /*
        1783 병든나이트
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 4가지 행동을 전부 했을때의 좌표 (0,7)
        // Maximum 좌표 (2,7)
        if(n == 1) {
            result = 1;
        }else if(n == 2) {
            // n == 2 일 때 위 아래 한칸씩 왔다갔다 할 수 있으나 4가지 행동은 불가능
            // 최대 이동가능한 칸 4칸, m/2가 4보다 큰경우 4를 출력한다 4가지 행동이 불가능하기때문
            // n == 2 일 때 위로 2칸을 못올라감, m은 오른쪽으로 2칸씩 가야한다.
            // 이 때 m이 홀수라면 1칸 손해본다
            result = Math.min(4, (m + 1) / 2);
        }else if(m < 7) {
            // m < 7 일 때 4가지 행동을 다 할수 없음
            result = Math.min(4, m);
        }else {
            // 4가지 행동 이후 시작하기 떄문에 시작좌표 (1,7), 그리고 5칸을 이미 방문
            // n은 위아래로 왔다갔다 하기떄문에 1,2일때를 제외하곤 신경쓰지 않는다.
            result = m - 7 + 5;
        }
        System.out.println(result);
    }
}