import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 백준 1181 정렬
// 첫줄에 정수 N을 입력받아 N개의 단어를 중복없이 짧은순으로 정렬
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = input.next();
        }
        // 정렬
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                else return o1.length() - o2.length();
            }
        });
//        System.out.println(Arrays.toString(arr));
        // 중복된 단어 제거가 안됨
        // 중복되지 않는 단어만 출력하기 위해 0번째 인덱스의 단어를 출력
        // 0번째 인덱스의 단어는 비교대상
        System.out.println(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}