import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (o1, o2) -> o2.length() - o1.length());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.isEmpty()) {
                set.add(arr[i]);
                continue;
            }
            boolean flag = false;
            for (String s : set) {
                if (s.startsWith(arr[i])) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                set.add(arr[i]);
            }
        }
        System.out.println(set.size());
    }
}