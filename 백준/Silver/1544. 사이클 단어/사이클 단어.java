import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String>[] arr = new ArrayList[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i].add(s.substring(j) + s.substring(0, j));
            }
            boolean check = true;
            for (int j = 0; j <= i - 1; j++) {
                for (int k = 0; k < arr[j].size(); k++) {
                    if (s.equals(arr[j].get(k))) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                count++;
            }
        }
        System.out.println(count);
    }
}