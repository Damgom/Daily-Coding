public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int num = selfNumCheck(i);
            if (num < 10001) {
                check[num] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }
    static int selfNumCheck(int num) {
        int temp = num;
        while (num != 0) {
            temp += num % 10;
            num /= 10;
        }
        return temp;
    }
}