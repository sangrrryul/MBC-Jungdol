package q9067;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int[] num = new int[10];
       for (int i = 0; i < num.length; i++) {
           num[i] = sc.nextInt();
       }

       System.out.print(num[2] + " ");
       System.out.print(num[4] + " ");
       System.out.print(num[9]);

       sc.close();
    }
}
