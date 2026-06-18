package q9042;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inp = 0;
        int sum = 0;
        int cnt = 0;

        do {
            inp = sc.nextIn();
            sum += inp;
            cnt++;
        } while(inp !=0);

        System.out.println("입력된 자료의 개수 = " + cnt);
        System.out.println("입력된 자료의 합계 = " + sum);
        System.out.printf("입력된 자료의 평균 = %2f\n", (double)sum / cnt);

        sc.close();
    }
}
