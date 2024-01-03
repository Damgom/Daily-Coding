import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] goods = new Integer[n];
        for(int i = 0; i < n; i++) {
            goods[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(goods, Comparator.reverseOrder());
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(i % 3 == 2) {
                continue;
            }
            sum += goods[i];
        }
        System.out.println(sum);
    }
}