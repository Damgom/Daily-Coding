import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] temp = s.split(" ");
        int min = Integer.parseInt(temp[0]);
        int max = Integer.parseInt(temp[0]);
        for(int i = 1; i < temp.length; i++){
            int comp = Integer.parseInt(temp[i]);
            if(min > comp) min = comp;
            if(max < comp) max = comp;
        }
        System.out.println(min + " " + max);
    }
}