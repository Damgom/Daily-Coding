import java.util.Scanner;

// 백준 2562번 1차원 배열 문제
// 아침 데일리코딩 문제와 비슷해서 골랐다
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지 구하는 프로그램
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 9개의 다른 수를 입력받기 위해 배열을 선언하고 scanner를 통해 수를 입력받는다
        int[] number = new int[9];
        for(int i = 0; i < 9; i++){
            number[i] = input.nextInt();
        }
        // 최대값을 찾기 위해 max변수 선언
        // 최대값의 위치를 찾기 위해 maxIndex 선언
        int max = 0;
        int maxIndex = 1;
        // 반복문을 통해 배열을 순회하고 배열의 요소가 max보다 크면 max를 number[i]로 대체한다.
        // 그 때 인덱스를 maxIndex에 넣는다
        for(int i = 0; i < number.length; i++){
            if(number[i] > max){
                max = number[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        // 인덱스는 0부터 시작하고 몇번째 수인지 구해야 하므로 +1
        System.out.println(maxIndex+1);
    }
}