import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet[] sets = new HashSet[501];
        for (int i = 0; i <= 500; i++) {
            sets[i] = new HashSet<>();
        }
        while (n-->0) {
            String temp = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < temp.length(); i++) {
                sb.append(temp.charAt(i));
                sets[sb.length()].add(sb.toString());
            }
        }
        int count = 0;
        while (m-->0) {
            String temp = br.readLine();
            if (sets[temp.length()].contains(temp)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
