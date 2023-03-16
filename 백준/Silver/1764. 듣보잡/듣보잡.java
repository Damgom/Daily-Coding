import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 타임아웃
//        String[] arr = new String[N+M];
//        for(int i = 0; i < N; i++){
//            arr[i] = br.readLine();
//        }
//        for(int i = N; i < N+M; i++){
//            arr[i] = br.readLine();
//        }
//
//        ArrayList<String> list = new ArrayList<>();
//        for(int i = 0; i < N; i++){
//            for(int j = N; j < N+M; j++){
//                if(arr[i].equals(arr[j])){
//                    list.add(arr[i]);
//                }
//            }
//        }

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < M; i++){
            String temp = br.readLine();
            if(set.contains(temp)){
                list.add(temp);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}