import java.io.*;
import java.util.StringTokenizer;

// 백준 15964 스타후르츠
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int count = 0;


        while(N > T){
            N -= T;
            count++;
        }

        int cost = C * count * P;
        bw.write(String.valueOf(cost));

        br.close();
        bw.close();
    }
}