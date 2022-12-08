import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String temp = Integer.toBinaryString(arr1[i]);
            if (temp.length() != n) {
                while(temp.length() != n) {
                    temp = "0" + temp;
                }
            }
            String temp2 = Integer.toBinaryString(arr2[i]);
            if (temp2.length() != n) {
                while(temp2.length() != n) {
                    temp2 = "0" + temp2;
                }
            }
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '0' && temp2.charAt(j) == '0') {
                    result.append(" ");
                }else {
                    result.append("#");
                }
            }
            answer[i] = result.toString();
        }
        return answer;
    }
}