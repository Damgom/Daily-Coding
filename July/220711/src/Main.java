import java.util.Scanner;
import java.util.Stack;

//백준 4949 균형잡힌세상 실버4
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while(true){
           str = input.nextLine();
            if(str.equals(".")){
                break;
            }
            System.out.println(balance(str));
        }
    }

    public static String balance(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '['){
                stack.push(c);
            }
            else if(c == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                }
                else stack.pop();
            }
            else if(c == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return "yes";
        }
        else return "no";
    }
}