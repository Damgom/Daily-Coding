import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<String> list = new ArrayList<>();
        for (int i = 1; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                list.add(getWord(s, i, j));
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }

    static String getWord(String s, int a, int b) {
        StringBuilder s1 = new StringBuilder(s.substring(0, a));
        StringBuilder s2 = new StringBuilder(s.substring(a, b));
        StringBuilder s3 = new StringBuilder(s.substring(b));
        return String.valueOf(s1.reverse()) + s2.reverse() + s3.reverse();
    }
}