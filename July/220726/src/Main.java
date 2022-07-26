import java.util.Arrays;
import java.util.Scanner;

//백준 10815 숫자 카드
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = input.nextInt();
        }
        // 이분탐색을 위한 정렬
        Arrays.sort(card);
        // 결과값을 담을 StringBuilder
        StringBuilder sb = new StringBuilder();

        int M = input.nextInt();
        for (int i = 0; i < M; i++) {
            int result = binarySearch(card, input.nextInt());
            if(result != -1){
                sb.append(1 + " ");
            }
            else sb.append(0 + " ");
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] card, int n) {
        int left = 0;
        int right = card.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(card[mid] == n){
                return mid;
            }
            else if(card[mid] < n){
                left = mid + 1;
            }
            else right = mid -1;
        }
        return -1;
    }
}