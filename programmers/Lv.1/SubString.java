public class SubString {
    public static void main(String[] args) {
        System.out.println(solution("aaabbaccccabba"));
    }
    public static int solution(String s) {
        int count = 0;
        int firstChar = 0;
        int otherChar = 0;

        char firstCh = s.charAt(0);
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == firstCh) {
                firstChar++;
            } else otherChar++;

            if (firstChar == otherChar) {
                count++;
                firstChar = 0;
                otherChar = 0;
                firstCh = s.charAt(i+1);
            }
        }
        return count + 1;
    }
}