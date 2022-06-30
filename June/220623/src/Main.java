import java.util.Scanner;

// 백준 1259 팰린드롬수 브론즈1
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int num = input.nextInt();
            if(num == 0){
                break;
            }else{
                String str = Integer.toString(num);
                String result = "yes";
                for(int i = 0; i < str.length() / 2; i++){
                    if(str.charAt(i) != str.charAt(str.length()-1-i)){
                        result = "no";
                        break;
                    }
                }
                System.out.println(result);
            }
        }
    }
}