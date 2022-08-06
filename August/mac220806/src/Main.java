import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 13305 주유소 그리디
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dist = new long[N-1];
        long[] price = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < dist.length; i++){
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < price.length; i++){
            price[i] = Long.parseLong(st.nextToken());
        }

        long result = 0;
        long minPrice = price[0];
        for(int i = 0; i < dist.length; i++){
            if(price[i] < minPrice){
                minPrice = price[i];
            }

            result += minPrice * dist[i];
        }

        System.out.println(result);

    }
}