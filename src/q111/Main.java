package q111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Korean = sc.nextInt();
        int English = sc.nextInt();
        int Math = sc.nextInt();
        int Computer = sc.nextInt();

        int sum = Korean + English + Math + Computer;
        int avg = sum/4;

        System.out.println("sum" + " " + sum);
        System.out.println("avg" + " " + avg);
        System.out.printf("%\n", (double)sum/score.length);

    }
}
