package q9121;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] str = {"champion","tel","pencil","jungol","olympiad","class",
                "information","lesson","book","tiger",};

                Scanner sc = new Scanner(System.in);
                System.out.println("문자를 입력하세요.");
                char ch = sc.next().charAt(0);
                sc.close();

                for (int i = 0; i<str.length; i++) {
                    if(ch== str[i].charAt(0))
                        System.out.println(str[i]);
                    }
                }
    }
}
