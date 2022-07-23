import java.io.*;

//백준 2588 곱셈
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();
        br.close();

        bw.write(String.valueOf(A * (B.charAt(2) - '0'))+"\n");
        bw.write(String.valueOf(A * (B.charAt(1) - '0'))+"\n");
        bw.write(String.valueOf(A * (B.charAt(0) - '0'))+"\n");
        bw.write(String.valueOf(A * Integer.parseInt(B))+"\n");
        bw.close();
    }
}