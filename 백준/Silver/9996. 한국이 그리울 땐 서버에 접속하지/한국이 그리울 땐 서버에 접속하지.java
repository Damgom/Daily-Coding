import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        StringTokenizer st = new StringTokenizer(pattern, "*");
        String startWord = st.nextToken();
        String endWord = st.nextToken();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String fileName = br.readLine();
            // aa*aa와 같은 경우 aaa 일 때 startWith, endWith 가 둘 다 성립하게 됨 이부분 에러날거같음 
            if (startWord.length() + endWord.length() > fileName.length()) {
                sb.append("NE").append("\n");
                continue;
            }
            if (fileName.startsWith(startWord) && fileName.endsWith(endWord)) {
                sb.append("DA").append("\n");
            } else sb.append("NE").append("\n");
        }
        System.out.println(sb);
    }
}