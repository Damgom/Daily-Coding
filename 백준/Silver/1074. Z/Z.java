import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2, n);
        solution(size, r, c);
        System.out.println(count);
    }
    public static void solution(int size, int r, int c) {
        if(size == 1){
            return;
        }
        int newSize = size / 2;
        if(r < newSize && c < newSize) {
            solution(newSize, r, c);
        }
        else if(r < newSize) {
            count += size * size / 4;
            solution(newSize, r, c - newSize);
        }
        else if(c < newSize) {
            count += (size * size / 4) * 2;
            solution(newSize, r - newSize, c);
        }
        else {
            count += (size * size / 4) * 3;
            solution(newSize, r - newSize, c - newSize);
        }
    }
}
