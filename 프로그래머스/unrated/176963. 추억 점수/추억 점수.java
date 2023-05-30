import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            String[] temp = photo[i];
            int sum = 0;
            for (String s : temp) {
                if (map.containsKey(s)) {
                    sum += map.get(s);
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}