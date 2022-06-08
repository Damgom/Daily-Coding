import java.util.Scanner;

//백준 16953번 GREEDY GRAPH
// A라는 숫자를 B로 만드는데 필요한 연산횟수
// 연산의 종류는 2를 곱하거나 1을 숫자 가장 오른쪽에 추가하는것
public class Main {
    static int num1, num2, cnt;
    static boolean flag;
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         num1 = input.nextInt();
         num2 = input.nextInt();
         dfs(num1, 1);
         if(flag) System.out.println(cnt);
         else System.out.println(-1);
    }
    public static void dfs(int num, int count){
        if(num > num2) {
            return;
        }
        if(num == num2){
            cnt = count;
            flag = true;
            return;
        }
        dfs(num*2, count+1);
        dfs(num*10+1,count+1);
    }
}

        //하드코딩
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        // 연산횟수를 세어주기위해 count 선언
//        int count = 1;
//        // num1과 num2가 같지 않을때 반복
//        while(num1 != num2){
//            // num1이 num2보다 클 경우 조건을 충족하지 못하므로 -1을 출력하고 멈춤
//            if(num1 > num2){
//                System.out.println(-1);
//                break;
//            }
//            if(num2 % 2 == 0){
//                num2 = num2 / 2;
//                count++;
//            }
//            if(num2 % 10 == 1){
//                num2 = num2 / 10;
//                count++;
//            }
//            if(num1 == num2){
//                System.out.println(count);
//            }
//        }
//    }
//}