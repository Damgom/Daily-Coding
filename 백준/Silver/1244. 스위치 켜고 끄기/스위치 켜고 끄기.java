import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] switchArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        switchArr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            switchArr[i] = Integer.parseInt(st.nextToken());
        }
        int student = Integer.parseInt(br.readLine());
        for(int i = 0; i < student; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            transfer(gender, num);
        }
        for(int i = 1; i <= n; i++) {
            System.out.print(switchArr[i] + " ");
            if(i % 20 == 0) {
                System.out.println();
            }
        }
    }
    public static void transfer(int gender, int num) {
        if(gender == 1) {
            for(int i = 1; i < switchArr.length; i++) {
                if(i % num == 0 && switchArr[i] == 0) {
                    switchArr[i] = 1;
                }else if(i % num == 0 && switchArr[i] == 1) {
                    switchArr[i] = 0;
                }
            }
        }else {
            int nextIdx = num+1;
            int prevIdx = num-1;
            if(switchArr[num] == 0) {
                switchArr[num] = 1;
            }else if(switchArr[num] == 1) {
                switchArr[num] = 0;
            }
            while(prevIdx > 0 && nextIdx < switchArr.length) {
                if(switchArr[nextIdx] != switchArr[prevIdx]) break;
                if(switchArr[nextIdx] == switchArr[prevIdx] && switchArr[nextIdx] == 0) {
                    switchArr[nextIdx] = switchArr[prevIdx] = 1;
                }else if(switchArr[nextIdx] == switchArr[prevIdx] && switchArr[nextIdx] == 1) {
                    switchArr[nextIdx] = switchArr[prevIdx] = 0;
                }
                nextIdx++;
                prevIdx--;
            }
        }
    }
}