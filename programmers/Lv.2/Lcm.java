public class Lcm {
    public static void main(String[] args) {
        int[] arr = new int[]{14,8,6,2};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int gcd = getGCD(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;
        for (int i = 2; i < arr.length; i++) {
            gcd = getGCD(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        return lcm;
    }
    public static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}