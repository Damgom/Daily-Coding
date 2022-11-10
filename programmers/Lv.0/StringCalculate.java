public class StringCalculate {
    public static void main(String[] args) {
        String my_string = "100 + 100";
        int answer = 0;

        String[] arr = my_string.trim().split(" ");
        answer = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i].equals("+")){
                answer +=  Integer.parseInt(arr[i+1]);
            }else if(arr[i].equals("-")){
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        System.out.println(answer);
    }
}