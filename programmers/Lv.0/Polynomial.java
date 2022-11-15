public class Polynomial {
    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";

        StringBuilder sb = new StringBuilder();
        String[] arr = polynomial.split(" \\+ ");
        int xValue = 0;
        int intValue = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains("x")) {
                if(arr[i].length() == 1) {
                    arr[i] = arr[i].replace("x", "1");
                    xValue += Integer.parseInt(arr[i]);
                }else {
                    arr[i] = arr[i].replace("x", "");
                    xValue += Integer.parseInt(arr[i]);
                }
            }else intValue += Integer.parseInt(arr[i]);
        }
        if(xValue == 0) {
            sb.append(intValue);
        }else if(intValue == 0) {
            if(xValue == 1) {
                sb.append("x");
            }else {
                sb.append(xValue).append("x");
            }
        }else {
            if(xValue == 1) {
                sb.append("x").append(" + ").append(intValue);
            }else {
                sb.append(xValue).append("x").append(" + ").append(intValue);
            }
        }
        System.out.println(sb.toString());
    }
}