import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        if(N >= 90) bw.write("A");
        else if(N >= 80) bw.write("B");
        else if(N >= 70) bw.write("C");
        else if(N >= 60) bw.write("D");
        else bw.write("F");
        bw.close();

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        sc.close();
//
//        if (a>=90) System.out.println("A");
//        else if (a>=80) System.out.println("B");
//        else if (a>=70) System.out.println("C");
//        else if (a>=60) System.out.println("D");
//        else System.out.println("F");
    }
}