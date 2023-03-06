import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int distance = n;
        while (distance != 0) {
            if (distance % 2 == 0) {
                distance /= 2;
            }else {
                distance -= 1;
                ans++;
            }
        }
        return ans;
    }
}