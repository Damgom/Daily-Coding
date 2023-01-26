import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_12891 {
    public static void main(String[] args) throws IOException {
        /**
         * @Boj_12891 DNA 비밀번호
         * @Implementation,SlidingWindow
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dnaLength = Integer.parseInt(st.nextToken());
        int passwordLength = Integer.parseInt(st.nextToken());
        String dna = br.readLine();
        List<Character> list = new ArrayList<>();
        String standard = "ACGT";
        for (int i = 0; i < standard.length(); i++) {
            list.add(standard.charAt(i));
        }
        st = new StringTokenizer(br.readLine());
        int[] require = new int[4];
        for (int i = 0; i < require.length; i++) {
            require[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for (int i = 0; i < passwordLength; i++) {
            char temp = dna.charAt(i);
            int requireDna = list.indexOf(temp);
            require[requireDna]--;
        }
        if (checkPassword(require)) {
            count++;
        }
        int index = 0;
        for (int i = passwordLength; i < dnaLength; i++) {
            require[list.indexOf(dna.charAt(index))]++;
            index++;
            char temp = dna.charAt(i);
            int requireDna = list.indexOf(temp);
            require[requireDna]--;
            if (checkPassword(require)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean checkPassword(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
