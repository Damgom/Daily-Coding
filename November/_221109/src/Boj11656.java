import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj11656 {
    public static void main(String[] args) throws IOException {
        /*
        접미사들을 리스트에 넣기 위해 substring 을 이용해 앞에서부터 한자리씩 자른다.
        사전순으로 정렬한다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            list.add(s.substring(i));
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}