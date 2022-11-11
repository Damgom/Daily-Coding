import java.util.Arrays;

public class AtoB {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";

        int answer = 0;

        String[] arr = before.split("");
        String[] arr1 = after.split("");

        Arrays.sort(arr);
        Arrays.sort(arr1);

        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals(arr1[i])) {
                answer = 0;
                break;
            }else answer = 1;
        }

        System.out.println(answer);
    }
}