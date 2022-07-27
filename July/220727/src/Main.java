
//프로그래머스 레벨1 음양 더하기
public class Main {
    public static void main(String[] args) {
        int[] absolutes = new int[]{4, 7, 12};
        boolean[] signs = new boolean[]{true, false, true};

        int result = 0;
        for(int i = 0; i < absolutes.length; i++){
            if(!signs[i]){
                absolutes[i] *= -1;
            }
            result += absolutes[i];
        }
        System.out.println(result);
    }
}