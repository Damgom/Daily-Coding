import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }
        int x = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(x - arr[i])) {
                answer++;
            }
        }
        System.out.println(answer / 2);
    }
}
