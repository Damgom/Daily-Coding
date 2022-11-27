import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivideZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3,2,6}, 5)));
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                result.add(arr[i]);
            }
        }

        Collections.sort(result);
        return result.stream().mapToInt(n -> n).toArray();
//        return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }
}