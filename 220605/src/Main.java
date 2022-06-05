    import java.util.Scanner;

    // 백준 2839 설탕공장에서 3킬로 5킬로 봉지를 조합하여 입력받은 설탕봉지를 최소한의 개수로 옮기는 방법
    // GREEDY
    // 5로 나눴을 때 나머지가 1이나 3이 남으면 몫 + 1
    // 나머지가 2나 4면 몫 + 2
    // 4나 7을 입력받은 경우 나누어 떨어지지 않는다 -1 출력
    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            if(num == 4 || num == 7) System.out.println(-1);
            else if(num % 5 == 0) System.out.println(num / 5);
            else if(num % 5 == 1 || num % 5 == 3) System.out.println((num / 5) + 1);
            else if(num % 5 == 2 || num % 5 == 4) System.out.println((num / 5) + 2);
        }
    }