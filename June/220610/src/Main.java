import java.util.Scanner;

// 백준 4344번 배열 사칙연산
// 평균보다 높은 학생들의 비율 구하기
// 크게 어려운건 없지만 입력받을 내용이 많아 실수하기 쉬움 슈도코드 작성 연습
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 테스트케이스의 수
        int n = input.nextInt();

        for(int i = 0; i < n; i++){
            //학생 수
            int N = input.nextInt();
            // 학생들의 점수
            int[] score = new int[N];
            // 점수의 합을 구하기 위해 sum 선언
            double sum = 0;
            for(int j = 0; j < N; j++){
                // 성적 입력
                score[j] = input.nextInt();
                // 성적 합
                sum += score[j];
            }
            // 평균
            double avg = (sum / N);
            // 성적이 평균 이상인 학생 수 count
            double count = 0;
            // 평균이상 학생 수 찾기
            for(int k = 0; k < N; k++){
                if(score[k] > avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
        input.close();
    }
}