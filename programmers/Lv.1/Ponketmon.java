import java.util.HashMap;
import java.util.Map;

public class Ponketmon {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
    }
    public static int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        return Math.min(map.keySet().size(), nums.length/2);
    }
}