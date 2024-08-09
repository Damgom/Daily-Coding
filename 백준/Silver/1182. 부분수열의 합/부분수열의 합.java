import java.util.Scanner;

// 백준 1182번 완전탐색
// N개의 정수로 이루어진 수열을 조합하여 S를 만드는 경우의 수 구하기
public class Main {
    static int N, S;
    static int[] num;
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        S = input.nextInt();
        num = new int[N];
        for(int i = 0; i < N; i++){
            num[i] = input.nextInt();
        }
        dfs(0,0);
        // S가 0인 경우 비어있는 수열을 입력받은 경우도 있으므로 -1
        if(S == 0) System.out.println(count -1);
        else System.out.println(count);
    }
    public static void dfs(int depth, int sum){
        if(depth == N){
            // sum과 S가 같은경우 경우의수 +1 하고 리턴
            if(sum == S) count++;
            return;
        }
        // 현재의 인덱스를 더하지 않고 재귀
        dfs(depth + 1, sum);
        // 현재의 인덱스를 더하고 재귀
        dfs(depth + 1, sum + num[depth]);
    }
}