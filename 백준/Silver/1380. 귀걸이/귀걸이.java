import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sequence = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 2 * n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int number = Integer.parseInt(st.nextToken());
                String stat = st.nextToken();
                if (list.contains(number)) {
                    list.remove(list.indexOf(number));
                } else {
                    list.add(number);
                }
            }
            sb.append(sequence).append(" ").append(arr[list.get(0) - 1]).append("\n");
            sequence++;
        }
        System.out.println(sb);
    }
}