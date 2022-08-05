import java.io.*;
import java.util.StringTokenizer;

// 백준 17496 스타후르츠
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

        /*N은 여름의 일 수
        T는 자라는데 걸리는 일 수
        수확 할 때마다 여름의 일 수를 줄이고 수확하는 횟수를 늘려준다
        * */
        while(N > T){
            N -= T;
            count++;
        }
        /*
        * C는 칸의 수, P는 가격*/
        int cost = C * count * P;
        bw.write(String.valueOf(cost));

        br.close();
        bw.close();
    }
}