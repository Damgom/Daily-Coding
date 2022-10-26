import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int wantSize = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }
        st = new StringTokenizer(br.readLine());
        int[] wantToFind = new int[wantSize];
        for(int i = 0; i < wantSize; i++) {
            wantToFind[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;

        for(int i = 0; i < wantToFind.length; i++) {
            int wantIndex = list.indexOf(wantToFind[i]);
            int halfIndex = 0;
            if(list.size() % 2 == 0) {
                halfIndex = list.size() / 2 - 1;
            }else halfIndex = list.size() / 2;

            if(wantIndex <= halfIndex) {
                for (int j = 0; j < wantIndex; j++) {
                    list.addLast(list.pollFirst());
                    count++;
                }
            }else {
                for(int j = 0; j < list.size()-wantIndex; j++) {
                    list.addFirst(list.pollLast());
                    count++;
                }
            }
            list.pollFirst();
        }
        System.out.println(count);
    }
}