import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] numberList = new String[n];
            for (int i = 0; i < n; i++) {
                numberList[i] = br.readLine();
            }
            Arrays.sort(numberList);
            System.out.println(checkNumber(numberList));
        }
    }
    static String checkNumber(String[] numberList) {
        boolean flag = false;
        for (int i = 0; i < numberList.length-1; i++) {
            if (numberList[i+1].startsWith(numberList[i])) {
                flag = true;
                break;
            }
        }
        return flag ? "NO" : "YES";
    }
}
