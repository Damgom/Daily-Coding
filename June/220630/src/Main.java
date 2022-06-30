import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

// 백준 10845 큐 실버4
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int a = 0;

        for(int i = 0; i < N; i++){
            String str = input.next();
            switch (str){
                case "push":
                    int num = input.nextInt();
                    queue.add(num);
                    a = num;
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(queue.remove() + "\n");
                    }break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        sb.append("1\n");
                    }
                    else{
                        sb.append("0\n");
                    }break;
                case "front":
                    if(queue.isEmpty()){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(queue.peek() + "\n");
                    }break;
                case "back":
                    if(queue.isEmpty()){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(a + "\n");
                    }break;
            }
        }
        System.out.println(sb);
    }
}