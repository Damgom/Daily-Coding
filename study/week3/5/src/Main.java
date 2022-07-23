import java.io.*;
import java.util.StringTokenizer;

// 백준 1330 두 수 비교하기
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        br.close();

        if(A > B) bw.write(">");
        else if (A < B) bw.write("<");
        else bw.write("==");

        bw.close();
    }
}