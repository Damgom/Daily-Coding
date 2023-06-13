import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();
//        String temp = "I";
//        for (int i = 0; i < n; i++) {
//            temp += "OI";
//        }
//        int count = 0;
//        for (int i = 0; i < m - temp.length(); i++) {
//            boolean flag = true;
//            for (int j = 0; j < temp.length(); j++) {
//                if (temp.charAt(j) != s.charAt(i + j)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                count++;
//            }
//        }
//        System.out.println(count);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                list.add(i);
            }
        }
        int count = 0;
        int answer = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) == 2) {
                count++;
            }else {
                count = 0;
            }
            if (count >= n) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}