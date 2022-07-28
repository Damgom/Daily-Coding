import java.util.Arrays;

//프로그래머스 42748 K번째 수
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1,5,2,6,3,7,4};
        int[][] commands = new int[][]{{2,5,3},{4,4,1},{1,7,3}};

        int[] result = new int[commands.length];
        //배열을 자른다
        for(int i = 0; i < commands.length; i++) {
            int[] copy = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            //정렬한다
            Arrays.sort(copy);
            result[i] = copy[commands[i][2]-1];
        }
        System.out.println(Arrays.toString(result));
    }
}