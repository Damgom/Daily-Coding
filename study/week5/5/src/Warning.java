import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Warning {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 현재 시간
        String s1 = br.readLine();
        // 나트륨 던질 시간
        String s2 = br.readLine();

        if(s1.equals(s2)){
            System.out.println("24:00:00");
            System.exit(0);
        }

        // : 기준으로 문자열을 쪼갬
        int h = Integer.parseInt(s2.split(":")[0]) - Integer.parseInt(s1.split(":")[0]);
        int m = Integer.parseInt(s2.split(":")[1]) - Integer.parseInt(s1.split(":")[1]);
        int s = Integer.parseInt(s2.split(":")[2]) - Integer.parseInt(s1.split(":")[2]);

        if(s < 0){
            s += 60;
            m--;
        }
        if(m < 0){
            m += 60;
            h--;
        }
        if(h < 0){
            h += 24;
        }

        System.out.format("%02d:%02d:%02d",h,m,s);
    }
}