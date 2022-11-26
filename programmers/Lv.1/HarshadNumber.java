public class HarshadNumber {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static boolean solution(int x) {
        boolean answer = false;
        int num = x;
        int temp = 0;
        while(x != 0) {
            temp += x % 10;
            x /= 10;
        }
        if(num % temp == 0) {
            answer = true;
        }
        return answer;
    }
}