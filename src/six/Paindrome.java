package six;

import java.util.Scanner;

public class Paindrome {
    public static void isItPalindorme() {
        Scanner sc = new Scanner(System.in);

        String origin = sc.nextLine();
        String reverse = "";

        for (int i = origin.length() - 1; i >= 0; i--) {
            reverse += origin.charAt(i);
        }

        if (origin.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
