import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String target = br.readLine();
        int[] alphabet = new int[26];
        for (int i = 0; i < target.length(); i++) {
            int temp = target.charAt(i) - 'A';
            alphabet[temp]++;
        }
        int answer = 0;
        for (int i = 0; i < n-1; i++) {
            int[] temp = alphabet.clone();
            String compare = br.readLine();
            int count = 0;
            for (int j = 0; j < compare.length(); j++) {
                if(temp[compare.charAt(j) - 'A'] != 0) {
                    count++;
                    temp[compare.charAt(j) - 'A']--;
                }
            }
            if (target.length() - 1 == compare.length() && count == compare.length()) {
                answer++;
            }else if (compare.length() == target.length()) {
                if (count == target.length() - 1 || count == target.length()) {
                    answer++;
                }
            }else if (compare.length() == target.length() + 1) {
                if (count == target.length()) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
