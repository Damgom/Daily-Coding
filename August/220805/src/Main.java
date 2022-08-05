import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 백준 2161 카드1 실버5 큐
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        //결과를 담을 곳
        StringBuilder sb = new StringBuilder();

        // 1 ~ N까지 큐에 넣는다
        for(int i = 1; i <= N; i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            //큐의 첫 요소를 빼고 결과에 넣기
            sb.append(q.poll()).append(" ");
            if(q.isEmpty()) break;
            //그 다음 큐의 첫 요소를 제일 마지막으로 보냄
            q.add(q.poll());

        }
        System.out.println(sb.toString());
    }
}