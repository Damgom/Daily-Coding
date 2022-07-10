import java.util.Scanner;


//백준 15829 Hashing 브론즈2
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 첫줄에 문자열의 길이 N입력
        int N = input.nextInt();
        // 문자열 입력
        String str = input.next();
        // result 초기화
        long result = 0;
        // 거듭제곱 초기값 1
        long pow = 1;
        for(int i = 0; i < N; i++){
            result += (str.charAt(i) - 96) * pow;
            pow = (pow * 31) % 1234567891;
        }
        System.out.println(result % 1234567891);
    }
}