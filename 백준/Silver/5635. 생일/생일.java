import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][4];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = st.nextToken();
            }
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[3].equals(o2[3])) {
                if (o1[2].equals(o2[2])) {
                    return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                }
                return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
            }
            return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
        });
        System.out.println(arr[n - 1][0]);
        System.out.println(arr[0][0]);
    }
}