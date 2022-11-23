public class SearchKim {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));

    }

    public static String solution(String[] seoul) {
        String answer = "김서방은 %d에 있다";
        String kim = "Kim";
        int index = 0;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals(kim)) {
                index = i;
            }
        }
        return String.format(answer, index);
    }
}