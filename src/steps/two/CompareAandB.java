package steps.two;

import java.util.Scanner;

public class CompareAandB {
    public static void compare() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputS = input.split(" ");

        Integer A = Integer.parseInt(inputS[0]);
        Integer B = Integer.parseInt(inputS[1]);

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A.equals(B)) {
            System.out.println("==");
        }
    }
}
