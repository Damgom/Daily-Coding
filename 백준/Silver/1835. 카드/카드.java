import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int p = 0;
        for (int i = 1; i <= n; i++) {
            while (arr[p] != 0) {
                p = (p + 1) % n;
            }
            for (int j = 0; j < i; j++) {
                p = (p + 1) % n;
                while (arr[p] != 0) {
                    p = (p + 1) % n;
                }
            }
            arr[p] = i;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);

    }
}
