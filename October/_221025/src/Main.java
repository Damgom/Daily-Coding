import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int docNum = Integer.parseInt(st.nextToken());
            int wantToFind = Integer.parseInt(st.nextToken());

            Queue<Integer> documents = new LinkedList<>();
            Queue<Integer> docIndex = new LinkedList<>();

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < docNum; j++) {
                documents.offer(Integer.parseInt(st2.nextToken()));
                docIndex.offer(j);
            }

            int count = 1;

            while(!documents.isEmpty()) {
                int max = Collections.max(documents);

                if(documents.peek() == max) {
                    if(docIndex.peek() == wantToFind) {
                        System.out.println(count);
                        break;
                    }
                    documents.poll();
                    docIndex.poll();
                    count++;
                }else {
                    documents.offer(documents.poll());
                    docIndex.offer((docIndex.poll()));
                }
            }
        }
    }
}