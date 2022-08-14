import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Character> queue = new LinkedList<>();
        String result = "";
        int N = Integer.parseInt(br.readLine());
        String A = br.readLine();
        String B = br.readLine();
        int count = 0;

        //큐에 데이터 A를 넣는다
        for(int i = 0; i < A.length(); i++){
            queue.add(A.charAt(i));
        }

        while (count != N){
            for(int i = 0; i < A.length(); i++){
                if(A.charAt(i) == '1'){
                    queue.poll();
                    queue.add('0');
                }
                else {
                    queue.poll();
                    queue.add('1');
                }
            }
            count++;
        }

        for(int i = 0; i < A.length(); i++){
            result += (queue.poll());
        }

        if(result.equals(B)) {
            System.out.println("Deletion succeeded");
        }
        else System.out.println("Deletion failed");

    }
}