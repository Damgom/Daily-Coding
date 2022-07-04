import java.util.Scanner;

//백준 9012번 괄호 실버4
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i = 0; i < T; i++){
            String ps = input.next();
            System.out.println(VPS(ps));
        }
    }
    public static String VPS(String str){
        int count = 0;
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
            }
            if(count < 0){
                result = "NO";
                break;
            }
        }
        if(count == 0){
            result = "YES";
        }
        else result = "NO";
        return result;
    }
}