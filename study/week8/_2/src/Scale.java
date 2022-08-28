import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Scale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[8];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        String result = "";
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] == arr[i+1]-1){
                result = "ascending";
            }
            else if(arr[i] == arr[i+1]+1){
                result = "descending";
            }
            else{
                result = "mixed";
                break;
            }
        }
        System.out.println(result);

    }
}