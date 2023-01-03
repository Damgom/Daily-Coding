import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1543 {
    public static void main(String[] args) throws IOException {
        /*
        boj_1543 문서 검색
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String compare = br.readLine();
//        int length = s.length();
//        int compareLength = compare.length();
//        s = s.replace(compare, "");
//        int answer = (length - s.length()) / compareLength;
//        System.out.println(answer);
        int count = 0;
        for (int i = 0; i <= s.length() - compare.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < compare.length(); j++) {
                if (s.charAt(i+j) != compare.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                i += compare.length() - 1;
            }
        }
        System.out.println(count);
    }
}