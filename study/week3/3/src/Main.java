import java.io.*;

//백준 20492 세금
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int a = (int) (N * (1 - 0.22));
        int b = (int) (N * (1 - 0.044));

        bw.write(String.valueOf(a)+"\n");
        bw.write(String.valueOf(b));
        br.close();
        bw.close();
    }
}