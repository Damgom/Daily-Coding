import java.util.Stack;

public class Dart {
    public static void main(String[] args) {
        /*
        2018 kakao blind recruitment
         */
        String dartResult = "1S*2T*3S";
        int answer = 0;
        int n = 0;
        Stack<Integer> result = new Stack<>();

        String temp = "";
        for(int i = 0; i < dartResult.length(); i++) {
            char cur = dartResult.charAt(i);

            if(cur >= '0' && cur <= '9') {
                temp += cur;
            }else if(cur == 'S' || cur == 'D' || cur == 'T') {
                n = Integer.parseInt(temp);
                if (cur == 'S') {
                    result.add((int) Math.pow(n, 1));
                }
                if (cur == 'D') {
                    result.add((int) Math.pow(n, 2));
                }
                if (cur == 'T') {
                    result.add((int) Math.pow(n, 3));
                }
                temp = "";
            }else {
                if(cur == '*') {
                    result.add(result.pop() * 2);
                    if(result.size() >= 2) {
                        int t = result.pop();
                        result.add(result.pop() * 2);
                        result.add(t);
                    }
                }else result.add(result.pop() * -1);
            }
        }
        int size = result.size();
        for(int i = 0; i < size; i++) {
            answer += result.pop();
        }
        System.out.println(answer);
    }
}