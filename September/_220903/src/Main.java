import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            System.out.println(Result(str));
        }
    }
    public static String Result(String str){
        String front = str.split("-")[0];
        String back = str.split("-")[1];

        int frontValue = 0;
        int backValue = Integer.parseInt(back);

        for(int i = 0; i < 3; i++){
            frontValue += ((front.charAt(i) - 'A') * Math.pow(26, 2 - i));
        }
        if(Math.abs(frontValue - backValue) <= 100){
            return "nice";
        }
        else return "not nice";
    }
}