import java.util.Scanner;

// 백준 1157 문자열
// 단어 하나를 입력받아 제일 많이 입력된 알파벳을 찾아 출력
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        // 대문자로 비교하기 위해 uppercase로 대문자 만들기
        str = str.toUpperCase();
        // 알파벳 개수 26개이므로 크기가 26인 배열 선언
        int[] arr = new int[26];
        // 반복문을 돌면서 일치하는 알파벳 나올때마다 해당인덱스 +1
        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i) - 'A';
            arr[num]++;
        }
        // 가장많이등장한 알파벳 찾기위해 max변수 선언 후 arr의 가장 큰 수를 찾는 반복문 입력
        int max = 0;
        // 가장 많이 등장한 알파벳이 2개 이상일 때 ? 출력
        char result = '?';
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                result = (char)(i+'A');
            }
            else if(max == arr[i]){
                result = '?';
            }
        }
        System.out.println(result);
    }
}