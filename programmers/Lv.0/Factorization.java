import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorization {
    public static void main(String[] args) {
        int n = 420;

        List<Integer> result = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(n); i++) {
            while(n % i == 0) {
                if(!result.contains(i)) {
                    result.add(i);
                }
                n /= i;
            }
        }
        if(n != 1) {
            result.add(n);
        }
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));
//        int[] answer = new int[result.size()];
//        for(int i = 0; i < result.size(); i++) {
//            answer[i] = result.get(i);
//        }
//        System.out.println(Arrays.toString(answer));
    }
}