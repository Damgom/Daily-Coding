import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        //1을 뒤집는 횟수
        int one = 0;
        //0을 뒤집는 횟수
        int zero = 0;

        for(int i = 1; i < s.length(); i++){
            //첫 숫자가 무엇인지에 따라서 뒤집는 횟수를 1회 더해줌
            if(s.charAt(0) == '0'){
                zero++;
            }
            else one++;
            //다른숫자가 나왔을 때 해당 숫자를 뒤집는 횟수를 더해줌
            if(s.charAt(i) != s.charAt(i-1)){
                if(s.charAt(i) == '1'){
                    one++;
                }
                else zero++;
            }
        }
        //둘 중 더 적은횟수를 구해줌
        int result = Math.min(one, zero);
        System.out.println(result);
    }
}