import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str){
                case "all":
                    result = (1 << 21) -1;
                    break;
                case "empty":
                    result = 0;
                    break;
                default:
                    int M = Integer.parseInt(st.nextToken());
                    switch(str){
                        case "add":
                            result |= (1 << M);
                            break;
                        case "remove":
                            result &= ~(1 <<M);
                            break;
                        case "check":
                            sb.append((result & (1 << M)) != 0 ? 1 : 0).append('\n');
                            break;
                        case "toggle":
                            result ^= (1 << M);
                            break;
                    }
            }
        }
        System.out.println(sb);
    }
}