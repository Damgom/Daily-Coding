public class LackOfMoney {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {

        long sum = 0;
        for(int i = 1; i <= count; i++) {
            sum += price * i;
        }

        long answer = sum - money;
        if(answer <= 0) {
            return 0;
        }else return answer;
//        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}