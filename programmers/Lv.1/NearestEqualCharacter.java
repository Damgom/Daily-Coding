import java.util.*;

public class NearestEqualCharacter {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("foobar")));
    }
    public static int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] result = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                result[i] = -1;
                map.put(s.charAt(i), i);
            }else {
                result[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            }
        }
        return result;
    }
}