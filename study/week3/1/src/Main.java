import java.io.*;
import java.util.StringTokenizer;

// 백준 15964 이상한 기호
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        br.close();

        bw.write(String.valueOf(At(A, B)));
        bw.flush();
        bw.close();
    }

    public static long At(long n, long m){
        return (n + m) * (n - m);
    }
}