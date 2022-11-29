import java.util.*;

public class StringCustomSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
    }
    public static String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>(List.of(strings));
        list.sort((o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            }
            return o1.charAt(n) - o2.charAt(n);
        });
        return list.stream().toArray(String[]::new);
    }
}