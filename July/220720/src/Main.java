import java.io.*;
import java.util.*;

// 백준 11004 K번째 수 실버5
public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        int K = input.nextInt();
//        int[] arr = new int[N];
//        for(int i = 0; i < N; i++){
//            arr[i] = input.nextInt();
//        }
//        시간초과
//        Arrays.sort(arr);
//        System.out.println(arr[K-1]);
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i < N; i++){
//            list.add(input.nextInt());
//        }
//        Collections.sort(list);
//        System.out.println(list.get(K-1));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        bw.write(String.valueOf(list.get(K-1)));

        bw.flush();
        br.close();
        bw.close();
    }
}