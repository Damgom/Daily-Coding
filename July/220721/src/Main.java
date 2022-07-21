//백준 4673 셀프 넘버
public class Main {
    public static void main(String[] args) {
        // 10000까지의 숫자를 체크해야함
        boolean[] check = new boolean[10001];

        // 10001까지 테스트
        for(int i = 1; i < 10001; i++){
            // 셀프넘버를 n에 할당
            int n = self(i);

            // 10001보다 작은 셀프넘버의 인덱스를 check 배열에
            if(n < 10001){
                check[n] = true;
            }
        }

        // check 배열을 돌면서 false 인 인덱스 출력
        for(int i = 1; i < 10001; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }
    }
    //셀프넘버인지 확인하는 메서드
    public static int self(int num){
        int sum = num;

        while(num != 0){
            //num 의 첫번째 자리를 더해준다.
            sum = sum + (num % 10);
            //10을 나눠 첫째자리를 없앤다.
            num = num / 10;
        }

        return sum;
    }
}