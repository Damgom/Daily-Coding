import java.util.Arrays;

public class Lifeboat {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{70, 80, 50}, 100));
    }
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int min = 0;
        for(int i = people.length-1; i >= min; i--) {
            if(people[min] + people[i] <= limit) {
                min++;
            }
            answer++;
        }
        return answer;
    }
}