import java.io.*;
import java.util.StringTokenizer;

//백준 1712 손익분기점
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        br.close();

        //재료비 B가 구매가격 C보다 크거나 같으면 손익분기점이 발생하지 않는다.
        if(B >= C) bw.write("-1");
        else bw.write((String.valueOf(A / (C - B) + 1)));
        bw.close();
    }
}