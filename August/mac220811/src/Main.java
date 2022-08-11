import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 계단
        int[] stair = new int[301];
        for(int i = 1; i <= N; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }

        int[] score = new int[301];

        score[1] = stair[1];
        score[2] = stair[1] + stair[2];
        //3칸 연속 밟을 수 없으니 1,2번 중 점수가 큰 계단과 3번 계단을 밟는다
        score[3] = Math.max(stair[1], stair[2]) + stair[3];

        // 4번 계단 - (1,3,4) (1,2,3) (2,4) 3가지 경우의 수가 있는데
        // 1,2번 계단을 밟은 경우와 2번 계단 하나를 밟은 경우 최대값을 이미 계산해두었기 때문에
        // 이 경우 score[2]와 stair[4]값을 더하면 된다.
        // 마찬가지로 1,3,4 계단을 밟는 경우 score[1]의 값과 stair[3], stair[4]값을 더하면 원하는 값을 얻을 수 있다.
        for(int i = 4; i <= N; i++){
            score[i] = Math.max(score[i-3] + stair[i] + stair[i-1], score[i-2] + stair[i]);
        }

        System.out.println(score[N]);
    }
}