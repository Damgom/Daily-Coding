import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_20920 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_20920 영단어 암기는 괴로워
         * @Sort,Hash
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() >= m) {
                words.put(word, words.getOrDefault(word, 0) + 1);
            }
        }
        List<String> result = new ArrayList<>(words.keySet());
        result.sort((o1, o2) -> {
            if (words.get(o1).equals(words.get(o2))) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }return o2.length() - o1.length();
            }
            return words.get(o2) - words.get(o1);
        });
        StringBuilder sb = new StringBuilder();
        for (String s : result) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}