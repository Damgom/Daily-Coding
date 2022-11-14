import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] sides = new int[]{11,7};
        Arrays.sort(sides);
        int count = 0;
        for(int i = sides[1]-sides[0]+1; i <= sides[1]; i++) {
            count++;
        }

        for(int i = sides[1]+1; i < sides[0]+sides[1]; i++) {
            count++;
        }
        System.out.println(count);
    }
}