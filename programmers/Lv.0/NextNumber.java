public class NextNumber {
    public static void main(String[] args) {
        int[] common = new int[]{2,4};

        int answer = 0;
        if((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common[common.length-1] + (common[1] - common[0]);
        }else {
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        System.out.println(answer);
    }
}