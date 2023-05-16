import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int time = 0;
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        List<String> list = new LinkedList<>();
        for (String city : cities) {
            String temp = city.toUpperCase();
            boolean hit = list.contains(temp);
            if (hit) {
                list.remove(temp);
                list.add(0, temp);
                time++;
            }else {
                time+=5;
                list.add(0, temp);
                if (list.size() > cacheSize) {
                    list.remove(list.size()-1);
                }
            }
        }
        return time;
    }
}