import java.util.HashMap;
import java.util.Map;

public class HateEnglish {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        long answer = 0;
        String[] arr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], String.valueOf(i));
        }
        String temp = "";
        String result = "";
        for(int i = 0; i < numbers.length(); i++) {
            temp += numbers.charAt(i);
            if(map.containsKey(temp)) {
                result += map.get(temp);
                temp = "";
            }
        }
        answer = Long.parseLong(result);
        System.out.println(answer);
    }
}