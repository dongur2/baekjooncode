package steps.one;

import java.util.Scanner;

public class FourFundamentalMath {
    public static void fourOperation() {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");

        Integer a = Integer.parseInt(inputs[0]);
        Integer b = Integer.parseInt(inputs[1]);

        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( a % b );
    }
}
