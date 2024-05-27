import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] king = st.nextToken().toCharArray();
        int[] kingLocation = new int[2];
        int[] stoneLocation = new int[2];
        kingLocation[0] = king[0] - 'A' + 1;
        kingLocation[1] = king[1] - '0';
        char[] stone = st.nextToken().toCharArray();
        stoneLocation[0] = stone[0] - 'A' + 1;
        stoneLocation[1] = stone[1] - '0';
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            int[] moveKing = move(command, kingLocation);
            if (checkLocation(moveKing)) {
                if (moveKing[0] == stoneLocation[0] && moveKing[1] == stoneLocation[1]) {
                    int[] moveStone = move(command, stoneLocation);
                    if (checkLocation(moveStone)) {
                        kingLocation = moveKing;
                        stoneLocation = moveStone;
                    }else continue;
                }else {
                    kingLocation = moveKing;
                }
            }
            checkLocation(kingLocation);
        }
        String resultKing = "";
        resultKing += (char) (kingLocation[0] + 'A' - 1);
        resultKing += kingLocation[1];
        String resultStone = "";
        resultStone += (char) (stoneLocation[0] + 'A' - 1);
        resultStone += stoneLocation[1];
        System.out.println(resultKing + "\n" + resultStone);
    }
    public static int[] move(String move, int[] arr) {
        int[] target = arr.clone();
        switch (move) {
            case "R" :
                target[0]++;
                break;
            case "L" :
                target[0]--;
                break;
            case "B" :
                target[1]--;
                break;
            case "T" :
                target[1]++;
                break;
            case "RT" :
                target[0]++;
                target[1]++;
                break;
            case "LT" :
                target[0]--;
                target[1]++;
                break;
            case "RB" :
                target[0]++;
                target[1]--;
                break;
            case "LB" :
                target[0]--;
                target[1]--;
                break;
        }
        return target;
    }
    public static boolean checkLocation(int[] target) {
        return target[0] >= 1 && target[0] <= 8 && target[1] >= 1 && target[1] <= 8;
    }
}
