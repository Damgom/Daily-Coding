import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long sum, sumFirst = 0, sumSecond = 0;
        for (int num : queue1) {
            sumFirst += num;
            q.add(num);
        }
        for (int num : queue2) {
            sumSecond += num;
            q2.add(num);
        }
        sum = sumFirst + sumSecond;
        if (sum % 2 == 1) {
            return -1;
        }
        long target = sum / 2;
        int length = q.size() * 2;
        int count = 0;
        int qCount = 0, q2Count = 0;
        while (qCount <= length && q2Count <= length) {
            if (sumFirst == target) {
                return count;
            }
            if (sumFirst > target) {
                int temp = q.poll();
                q2.add(temp);
                sumFirst -= temp;
                sumSecond += temp;
                qCount++;
            } else if (sumSecond > target) {
                int temp = q2.poll();
                q.add(temp);
                sumFirst += temp;
                sumSecond -= temp;
                q2Count++;
            }
            count++;
        }
        return -1;
    }
}