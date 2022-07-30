import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] d = new int[]{1,3,2,5,4};
        int budget = 9;

        Arrays.sort(d);
        int count = 0;
        for(int i = 0; i < d.length; i++){
            budget -= d[i];

            if(budget < 0) break;
            count++;
        }
        System.out.println(count);
    }
}