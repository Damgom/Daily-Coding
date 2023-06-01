import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : win_nums) {
            set.add(num);
        }
        int count = 0;
        int zero_count = 0;
        for (int num : lottos) {
            if (set.contains(num)) {
                count++;
            }
            if (num == 0) {
                zero_count++;
            }
        }
        int best = count + zero_count;
        int lowest = count;
        int[] answer = new int[2];
        answer[0] = Math.min(7 - best, 6);
        answer[1] = Math.min(7 - lowest, 6);
        return answer;
    }
}