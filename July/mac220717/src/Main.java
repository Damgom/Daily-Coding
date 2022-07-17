import java.util.Scanner;

// 백준 1476 날짜 계산 실버5
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int E = input.nextInt();
        int S = input.nextInt();
        int M = input.nextInt();

        // 초기값 설정
        int e = 0;
        int s = 0;
        int m = 0;
        int year = 0;

        while(true){
            year++;
            e++;
            s++;
            m++;

            if(e == 16){
                e = 1;
            }
            if(s == 29){
                s = 1;
            }
            if(m == 20){
                m = 1;
            }
            if(E == e && S == s && M == m){
                break;
            }
        }
        System.out.println(year);
    }
}