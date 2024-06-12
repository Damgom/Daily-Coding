import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Character[][] candies = new Character[n][n];
        for(int i = 0; i < n; i++) {
            String candy = br.readLine();
            for(int j = 0; j < n; j++) {
                candies[i][j] = candy.charAt(j);
            }
        }

        int result = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-1; j++) {
                char temp = candies[i][j];
                // 가로줄 바꾸기
                candies[i][j] = candies[i][j+1];
                candies[i][j+1] = temp;
                countCandy(candies);

                // 원상복구
                temp = candies[i][j];
                candies[i][j] = candies[i][j+1];
                candies[i][j+1] = temp;
            }
            result = Math.max(result, max);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-1; j++) {
                char temp = candies[j][i];
                // 세로줄 바꾸기
                candies[j][i] = candies[j+1][i];
                candies[j+1][i] = temp;
                countCandy(candies);

                // 원상복구
                temp = candies[j][i];
                candies[j][i] = candies[j+1][i];
                candies[j+1][i] = temp;
            }
            result = Math.max(result, max);
        }

        System.out.println(result);
    }

    public static void countCandy(Character[][] candies) {
        for(int i = 0; i < candies.length; i++) {
            int count = 1;
            for(int j = 0; j < candies.length - 1; j++) {
                if(candies[i][j] == candies[i][j+1]) {
                    count++;
                }else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }

        for(int i = 0; i < candies.length; i++) {
            int count = 1;
            for (int j = 0; j < candies.length - 1; j++) {
                if (candies[j][i] == candies[j + 1][i]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }
    }
}