import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Character> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String A = br.readLine();
        String B = br.readLine();
        int count = 0;

//        //큐에 데이터 A를 넣는다
//        for(int i = 0; i < A.length(); i++){
//            queue.add(A.charAt(i));
//        }
//
//        //count가 N과 같아질때까지 반복
//        while (count != N){
//            for(int i = 0; i < A.length(); i++){
//                //1이면 큐에서 poll하고 뒤에 0을 넣는다
//                if(A.charAt(i) == '1'){
//                    queue.poll();
//                    queue.add('0');
//                }
//                //0일때 큐에서 poll하고 뒤에 1을 넣는다
//                else {
//                    queue.poll();
//                    queue.add('1');
//                }
//            }
//            count++;
//        }
//
//        //큐의 결과값을 result string으로만든다
//        for(int i = 0; i < A.length(); i++){
//            result.append(queue.poll());
//        }
//
//        if(result.toString().equals(B)) {
//            System.out.println("Deletion succeeded");
//        }
//        else if(A.length() == 0 && B.length() == 0 || A.equals(" ") && B.equals(" ")){
//            System.out.println("Deletion succeeded");
//        }
//        else System.out.println("Deletion failed");
        while (count != N){
            A = A.replaceAll("0", "-");
            A = A.replaceAll("1", "0");
            A = A.replaceAll("-", "1");
            count++;
        }
        if(A.equals(B)){
            System.out.println("Deletion succeeded");
        }
        else System.out.println("Deletion failed");
    }
}