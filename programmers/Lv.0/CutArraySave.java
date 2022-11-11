import java.util.ArrayList;
import java.util.List;

public class CutArraySave {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        List<String> list = new ArrayList<>();

        String temp = "";
        for (int i = 0; i < my_str.length(); i++) {
            temp += my_str.charAt(i);
            if (i == my_str.length() - 1 || temp.length() == n) {
                list.add(temp);
                temp = "";
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}