package q9051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.print("입력받은 짝수는 " + count + "개입니다.");
        sc.close();
    }
}
