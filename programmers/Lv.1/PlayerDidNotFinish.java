import java.util.HashMap;
import java.util.Map;

public class PlayerDidNotFinish {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}));
    }
    public static String solution(String[] participant, String[] completion) {
        // 시간초과
//        List<String> list = new ArrayList<>(List.of(participant));
//        for(int i = 0; i < completion.length; i++) {
//            list.remove(list.indexOf(completion[i]));
//        }
//        return list.get(0);
        // 정렬
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        int i;
//        for(i = 0; i < completion.length; i++) {
//            if(!participant[i].equals(completion[i])) break;
//        }
//        return participant[i];
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        for(int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.get(completion[i]) -1);
        }
        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }
}