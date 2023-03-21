class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int temp = 0;
            if (food[i] >= 2) {
                temp = food[i] / 2;
            }
            for (int j = 0; j < temp; j++) {
                sb.append(i);
            }
        }
        String result = sb.toString();
        result += "0";
        result += sb.reverse();
        return result;
    }
}