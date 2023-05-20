import java.util.*;

class Solution {
    
    private static final String IN = "님이 들어왔습니다.";
    private static final String OUT = "님이 나갔습니다.";
    
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String[]> result = new ArrayList<>();
        for (String s : record) {
            StringTokenizer st = new StringTokenizer(s);
            String status = st.nextToken();
            String uid = st.nextToken();
            if (status.equals("Leave")) {
                result.add(new String[]{uid, OUT});
                continue;
            }
            String nickname = st.nextToken();
            if (status.equals("Enter")) {
                map.put(uid, nickname);
                result.add(new String[]{uid, IN});
            } else if (status.equals("Change")) {
                map.put(uid, nickname);
            }
        }
        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = map.get(result.get(i)[0]) + result.get(i)[1];
        }
        return answer;
    }
}