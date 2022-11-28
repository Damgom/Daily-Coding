public class MakeJadenCaseString {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
    }
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.toLowerCase().split("");
        boolean flag = true;
        for(int i = 0; i < arr.length; i++) {
            if(!flag) {
                answer.append(arr[i]);
            }else {
                answer.append(arr[i].toUpperCase());
                flag = false;
            }
            if(arr[i].equals(" ")) {
                flag = true;
            }
        }
        return answer.toString();
    }
}