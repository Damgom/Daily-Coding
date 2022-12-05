import java.util.*;

public class EnglishWordGame {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
    }
    public static int[] solution(int n, String[] words) {
        Queue<String> queue = new LinkedList<>(List.of(words));
        List<String> answer = new ArrayList<>();
        int[] result = new int[2];
        int size = queue.size();
        int person = 0;
        int count = 1;
        answer.add(queue.poll());
        for(int i = 1; i < size; i++) {
            String temp = queue.poll();
            String lastString = answer.get(answer.size()-1);
            if(i % n == 0) {
                count++;
            }
            if(!answer.contains(temp) && lastString.charAt(lastString.length()-1) == temp.charAt(0)) {
                answer.add(temp);
            }else {
                person = (i % n) + 1;
                break;
            }
        }
        if(size == answer.size()) {
            return result;
        }
        else {
            result[0] = person;
            result[1] = count;
        }
        return result;
    }
}