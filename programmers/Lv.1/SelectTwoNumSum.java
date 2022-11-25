import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectTwoNumSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
    }

    public static int[] solution(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        boolean[] check = new boolean[10001];
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                int temp = numbers[i] + numbers[j];
                check[temp] = true;
            }
        }
        for(int i = 0; i < check.length; i++) {
            if(check[i]) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(n -> n).toArray();
    }
}