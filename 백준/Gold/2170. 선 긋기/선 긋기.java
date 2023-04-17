import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new int[]{x, y});
        }
        list.sort((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }return o1[0] - o2[0];
        });
        int initX = list.get(0)[0];
        int initY = list.get(0)[1];
        int length = initY - initX;
        for (int i = 1; i < list.size(); i++) {
            int curX = list.get(i)[0];
            int curY = list.get(i)[1];
            if (initX <= curX && curY <= initY) {
                continue;
            }else if (curX < initY) {
                length += curY - initY;
            }else {
                length += curY - curX;
            }
            initX = curX;
            initY = curY;
        }
        System.out.println(length);
    }
}
