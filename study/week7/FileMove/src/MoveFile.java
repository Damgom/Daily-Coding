import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MoveFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[2];
        int[] B = new int[2];

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        String s2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s2);

        for(int i = 0; i < 2; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < 2; i++){
            B[i] = Integer.parseInt(st2.nextToken());
        }

        int result1 = A[0] + B[1];
        int result2 = A[1] + B[0];

        System.out.println(Math.min(result1, result2));
    }
}