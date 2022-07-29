import java.util.ArrayList;
import java.util.Arrays;

//프로그래머스 모의고사
public class Main {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        //반복됨
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2,4,2,5};
        int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};

        //맞은문제의 개수
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;

        for(int i = 0; i < answers.length; i++){
            if(a[i % a.length] == answers[i]) aCount++;
            if(b[i % b.length] == answers[i]) bCount++;
            if(c[i % c.length] == answers[i]) cCount++;
        }
        //가장 많이 맞은 정답 개수
        int max = Math.max(Math.max(aCount,bCount),cCount);
        //결과를 담을 배열
        ArrayList<Integer> result = new ArrayList<>();
        if(max == aCount) result.add(1);
        if(max == bCount) result.add(2);
        if(max == cCount) result.add(3);

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }

        System.out.println(Arrays.toString(answer));

    }
}