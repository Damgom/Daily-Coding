public class ChickenCoupon {
    public static void main(String[] args) {
        int chicken = 1081;

        int answer = 0;
        while(chicken >= 10) {
            int couponChicken = chicken / 10;
            int coupon = chicken % 10;
            chicken = couponChicken + coupon;

            answer += couponChicken;
        }

        System.out.println(answer);
    }
}