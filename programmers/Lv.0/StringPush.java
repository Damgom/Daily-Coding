public class StringPush {
    public static void main(String[] args) {
        String A = "looel";
        String B = "ohell";

        System.out.println((B + B).indexOf(A));
    }
//
//        int answer = -1;
//        Deque<Character> deque = new LinkedList<>();
//        for(int i = 0; i < A.length(); i++) {
//            deque.offerLast(A.charAt(i));
//        }
//        int count = A.length();
//
//        if(A.equals(B)) {
//            answer = 0;
//        }
//        if(!A.equals(B)) {
//            while(count != 0) {
//                deque.offerFirst(deque.pollLast());
//                count--;
//                String temp = dequeToString(deque);
//                if(temp.equals(B)){
//                    answer = A.length() - count;
//                    break;
//                }
//            }
//        }
//        System.out.println(answer);
//    }
//    public static String dequeToString(Deque<Character> deque) {
//        String result = "";
//        int size = deque.size();
//        for(int i = 0; i < size; i++) {
//            result += deque.peekFirst();
//            deque.offerLast(deque.pollFirst());
//        }
//
//        return result;
//    }
}