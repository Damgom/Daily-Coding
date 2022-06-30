import java.util.Scanner;
import  java.util.Arrays;

// 백준 10610번 GREEDY
// 입력받은 숫자의 자리수를 분해하여 30의 배수중 가장 큰 수 구하기
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nStr = input.nextLine();
        // 모든 숫자의 합을 보기 위해 sum 선언
        int sum = 0;

        // 30의 배수는 3의 배수이기도 하다. 자리수를 합해서 3으로 나눴을 때 0으로 나누어 떨어지면 3의 배수
        // 배열에 분해한 숫자를 담은 후 정렬
        char[] arr = nStr.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        // 큰수부터 탐색하고 넣기 위해 초기값을
        for(int i = arr.length-1; i >= 0; i--){
            int num  = arr[i] - '0';
            sum += num;
            sb.append(num);
        }
        // 30의 배수를 판단
        if(sum % 3 != 0 || arr[0] != '0'){
            System.out.println(-1);
            return;
        }
        System.out.println(sb.toString());
    }
}
