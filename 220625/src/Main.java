import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 2164 카드2 큐 실버4
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 1; i <= N; i++) {
//            queue.offer(i);
//        }
//        // 남은 큐에서 첫번째 값을 poll이후 offer
//        //반복후 queue의 사이즈가 1일 때 리턴
//        while(queue.size() > 1){
//            queue.poll();
//            queue.offer(queue.poll());
//        }
//        System.out.println(queue.poll());
//    }
//}

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(search(N));
    }
    public static int search(int N){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }
        while(queue.size() > 1){
            queue.poll();
            queue.offer(queue.poll());
        }
        return queue.poll();
    }
}