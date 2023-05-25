import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        int discountLength = discount.length;
        for (int i = 0; i <= discountLength - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = 0; j < 10; j++) {
                String item = discount[i + j];
                discountMap.put(item, discountMap.getOrDefault(item, 0) + 1);
            }
            boolean flag = true;
            for (String wantToBuy : map.keySet()) {
                int wantCount = map.get(wantToBuy);
                int discountCount = discountMap.getOrDefault(wantToBuy, 0);
                if (wantCount > discountCount) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;
            }
        }
        return answer;
    }
}