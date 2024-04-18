import java.util.ArrayList;
import java.util.Scanner;

//백준 1316 그룹단어체커 실버5
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++){
            if(check(input.next())){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(String str){       
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            String alp = str.substring(i, i+1);
            if(!list.contains(alp)) {
                list.add(alp);
            }
            else if(str.charAt(i-1) != str.charAt((i))) {               
                return false;
            }
        }
        return true;
    }
}