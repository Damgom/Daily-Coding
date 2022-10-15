import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            Stack<String> list = new Stack<>();
            String str = br.readLine();
            String[] arr = str.split(" ");
            list.addAll(Arrays.asList(arr));
            for(int j = 0; j < arr.length; j++) {
                sb.append(" ").append(list.pop());
            }
            System.out.println("Case #" + count + ":" + sb);
            count++;
        }
    }
}