import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(br.readLine());
        }
        list.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                if (value(o1) == value(o2)) {
                    return o1.compareTo(o2);
                }return value(o1) - value(o2);
            }return o1.length() - o2.length();
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    static int value(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp >= '0' && temp <= '9') {
                count += temp - '0';
            }
        }
        return count;
    }
}
