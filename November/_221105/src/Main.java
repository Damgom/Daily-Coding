import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> wear = new HashMap<>();

            for(int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                wear.put(type, wear.getOrDefault(type, 0) + 1);
            }

            int result = wear.values().stream().mapToInt(a -> a).map(a -> a + 1).reduce(1, (a, b) -> a * b);
            System.out.println(result - 1);
        }
    }
}