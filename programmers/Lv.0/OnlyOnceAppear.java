import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OnlyOnceAppear {
    public static void main(String[] args) {
        String s = "abdc";
        String answer = "";
        List<Character> result = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for(int j = 0; j < s.length(); j++) {
                if(i != j) {
                    if (s.charAt(i) == s.charAt(j)) {
                        flag = true;
                    }
                }
            }
            if(!flag) {
                result.add(s.charAt(i));
            }
        }
        Collections.sort(result);
        for(int i = 0; i < result.size(); i++) {
            answer += result.get(i);
        }
        System.out.println(answer);
    }
}