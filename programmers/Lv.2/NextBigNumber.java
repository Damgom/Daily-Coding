public class NextBigNumber {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }
    public static int solution(int n) {
//        int oneCount = toBinary(n);
//        while(true) {
//            int next = ++n;
//            if(oneCount == toBinary(next)) {
//                return next;
//            }
//        }
        int a = Integer.bitCount(n);
        int compare = n + 1;
        while(true) {
            if(Integer.bitCount(compare) == a) {
                break;
            }
            compare++;
        }
        return compare;
    }
//    public static int toBinary(int num) {
//        String number = Integer.toBinaryString(num);
//        int count = 0;
//        for(int i = 0; i < number.length(); i++) {
//            char ch = number.charAt(i);
//            if(ch == '1') count++;
//        }
//        return count;
//    }
}