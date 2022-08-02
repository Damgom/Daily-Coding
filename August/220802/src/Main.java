public class Main {
    public static void main(String[] args) {
        String s = "one4seveneight";
        // 영단어 배열 만들기
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // 숫자가 0~9까지 10개
        // 반복문
        for(int i = 0; i < 10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }

        int answer = Integer.parseInt(s);

        System.out.println(answer);
    }
}