public class HideNumberSum2 {
    public static void main(String[] args) {
        String my_string = "1as221dc1csaaz0asdvc1";
        int answer = 0;

        String temp = "";
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= '0' && c <= '9') {
                temp += c;
            }else {
                if(temp.length()!=0){
                    answer += Integer.parseInt(temp);
                }
                temp = "";
            }
        }
        if(!temp.equals("")) {
            answer += Integer.parseInt(temp);
        }
        System.out.println(answer);

        /*
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]", " ");
        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()) {
            answer += Integer.parseInt(st.nextToken());
        }

        return answer;
         */
    }
}