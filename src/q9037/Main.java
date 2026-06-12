package q9037;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");

        int a = sc.nextInt();
        sc.close();

        char grade = '\0';
        if (90 <= a && a <= 100) {
            grade = 'A';
        }else if (80 <= a && a <= 89) {
            grade = 'B';
        }else if (70 <= a && a <= 79) {
            grade = 'C';
        }else if (60 <= a && a <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);
    }
}
