import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        * 시간초과 시간복잡도 n^2
        */
//        String str = br.readLine();
//        List<String> result = new LinkedList<>();
//        for(int i = 0; i < str.length(); i++) {
//            result.add(String.valueOf(str.charAt(i)));
//        }
//        int n = Integer.parseInt(br.readLine());
//
//        int currentIndex = result.size();
//        for(int i = n; i > 0; i--) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            String s = st.nextToken();
//
//            if(s.equals("L")) {
//                if(currentIndex > 0) {
//                    currentIndex--;
//                }
//            }else if(s.equals("D")) {
//                if(currentIndex < result.size()) {
//                    currentIndex++;
//                }
//            }else if(s.equals("B")) {
//                if(currentIndex > 0) {
//                    result.remove(currentIndex - 1);
//                    currentIndex--;
//                }
//            }else {
//                result.add(currentIndex, st.nextToken());
//                currentIndex++;
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < result.size(); i++) {
//            sb.append(result.get(i));
//        }
//        System.out.println(sb);
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        // 커서 기준으로 왼쪽과 오른쪽 스택에 문자열을 넣는다
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            left.push(str.substring(i, i+1));
        }

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if(order.equals("L")) {
                if(!left.isEmpty()) {
                    right.push(left.pop());
                }
            }else if(order.equals("D")) {
                if(!right.isEmpty()) {
                    left.push(right.pop());
                }
            }else if(order.equals("B")) {
                if(!left.isEmpty()) {
                    left.pop();
                }
            }else left.push(st.nextToken());
        }
        int leftSize = left.size();
        for(int i = 0; i < leftSize; i++) {
            right.push(left.pop());
        }
        int rightSize = right.size();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rightSize; i++) {
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}