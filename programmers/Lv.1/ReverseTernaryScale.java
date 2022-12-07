public class ReverseTernaryScale {
    public static void main(String[] args) {
        System.out.println(solution(125));
    }
    public static int solution(int n) {
        String temp = "";
        while(n >= 3) {
            temp += n % 3;
            n /= 3;
        }
        temp += n;

        return Integer.parseInt(temp, 3);
    }
}