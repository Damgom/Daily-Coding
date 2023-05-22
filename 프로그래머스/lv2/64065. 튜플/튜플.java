import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        s = s.substring(2);
        s = s.substring(0, s.length()-2).replace("},{","-");
        String[] stringArr = s.split("-");
        Arrays.sort(stringArr, Comparator.comparingInt(String::length));
        for (String str : stringArr){
            String[] temp = str.split(",");
            for (String value : temp) {
                int n = Integer.parseInt(value);
                if (!answer.contains(n))
                    answer.add(n);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}