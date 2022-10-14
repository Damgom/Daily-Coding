import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        List<String> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
            StringBuilder temp = new StringBuilder();
            for(int j = arr[i].length()-1; j >= 0; j--) {
                temp.append(arr[i].charAt(j));
            }
            result.add(temp.toString());
        }
        for(int i = 0; i < arr.length; i++) {
            if(result.contains(arr[i])) {
                System.out.println(arr[i].length() + " " + arr[i].charAt(arr[i].length()/2));
                break;
            }
        }
    }
}