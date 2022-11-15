import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMinValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = Integer.MAX_VALUE;
        int index = 0;
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
            temp.add(arr[i]);
        }
        temp.remove(index);
        if(temp.size() == 0) {
            temp.add(-1);
        }
        int[] answer = temp.stream().mapToInt(x -> x).toArray();

        System.out.println(Arrays.toString(answer));
    }
}