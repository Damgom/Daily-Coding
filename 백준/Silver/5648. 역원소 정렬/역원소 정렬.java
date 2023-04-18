import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = convert(sc.next());
        }
        Arrays.sort(arr);
        for (long num : arr) {
            System.out.println(num);
        }
    }
    static long convert(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return Long.parseLong(temp);
    }
}
