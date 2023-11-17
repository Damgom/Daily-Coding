import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;
        while (n-- > 0) {
            String input = br.readLine();
            if (input.equals("ENTER")) {
                count += set.size();
                set.clear();
            } else {
                set.add(input);
            }
        }
        System.out.println(count + set.size());
    }
}