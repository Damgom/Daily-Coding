import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] costume : clothes) {
            String type = costume[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        int answer = 1;
        for (int costume : list) {
            answer *= costume + 1;
        }
        return answer - 1;
    }
}