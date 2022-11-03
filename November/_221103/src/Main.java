import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String aaaa = "AAAA";
        String bb = "BB";

        input = input.replaceAll("XXXX", aaaa);
        String result = input.replaceAll("XX", bb);
        if(result.contains("X")) {
            result = "-1";
        }
        System.out.println(result);
    }
}