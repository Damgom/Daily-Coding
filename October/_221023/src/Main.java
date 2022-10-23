import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < n; i++) {
            hashSet.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer> result = new ArrayList<>(hashSet);
        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < result.size(); i++) {
            sb.append(result.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}