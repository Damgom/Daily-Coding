import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) - 64) <= 3){
                count += 3;
            }
            else if ((s.charAt(i) - 64) <= 6){
                count += 4;
            }
            else if((s.charAt(i) - 64) <= 9){
                count += 5;
            }
            else if((s.charAt(i) - 64) <= 12){
                count += 6;
            }
            else if((s.charAt(i) - 64) <= 15){
                count += 7;
            }
            else if((s.charAt(i) - 64) <= 19){
                count += 8;
            }
            else if((s.charAt(i) - 64) <= 22){
                count += 9;
            }
            else if((s.charAt(i) - 64) <= 26){
                count += 10;
            }
        }
        System.out.println(count);
    }
}