import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_5430 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        /*
        boj_5430 AC , 골드5
        덱
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
//            List<Integer> numList = parseArr(br.readLine());
            for(int j = 0; j < n; j++) {
                deque.add((Integer.parseInt(st.nextToken())));
            }
            isFlag(p, deque);
        }
        System.out.println(sb);
    }

    private static void isFlag(String p, Deque<Integer> deque) {
        boolean flag = true;

        for (int j = 0; j < p.length(); j++) {
            char temp = p.charAt(j);
            if (temp == 'R') {
                flag = !flag;
                continue;
            }
            if (flag) {
                if(deque.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }
            }else {
                if(deque.pollLast() == null){
                    sb.append("error\n");
                    return;
                }
            }
        }
        output(deque, flag);
    }

    public static List<Integer> parseArr(String arr) {
        List<Integer> result = new ArrayList<>();
        char[] tempArr = arr.toCharArray();
        for(int i = 1; i < tempArr.length-1; i+=2) {
            result.add(tempArr[i]-'0');
        }
        return result;
    }

    public static void output(Deque<Integer> deque, boolean flag) {
        sb.append('[');

        if(!deque.isEmpty()) {
            if (flag) {
                sb.append(deque.pollFirst());
                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());
                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            }
        }
        sb.append(']').append('\n');
    }
}