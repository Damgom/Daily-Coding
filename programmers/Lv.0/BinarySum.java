public class BinarySum {
    public static void main(String[] args) {
        String bin1 = "1001";
        String bin2 = "1111";
        String answer = "";

        int temp = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        answer = Integer.toBinaryString(temp);

        System.out.println(answer);
    }
}