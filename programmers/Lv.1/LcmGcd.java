import java.util.Arrays;

public class LcmGcd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12, 36)));
    }
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i < Math.max(n,m); i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }
//        int[] answer = new int[2];
//        answer[0] = gcd(n, m);
//        answer[1] = lcm(n, m);
//        return answer;
//    }
//    public static int gcd(int a, int b) {
//        if(b == 0) return a;
//        return gcd(b, a % b);
//    }
//    public static int lcm(int a, int b) {
//        return a * b / gcd(a, b);
//    }
}