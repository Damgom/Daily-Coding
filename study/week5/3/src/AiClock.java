import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        //N을 60으로 나누고 B에 더해줌(분) 나머지를 C에 더해줌(초)
        B += N / 60;
        C += N % 60;
        //C를 60으로 나누고 B에 더해주고 나머지만 남김
        B += C / 60;
        C %= 60;
        //B를 60으로 나누고 A에 더해줌(시간) 나머지만 남김
        A += B / 60;
        B %= 60;
        //시간을 24로 나눈 나머지로 할당 24 위로 안나오게 함
        A %= 24;

        System.out.println(A + " " + B + " " + C);
    }
}