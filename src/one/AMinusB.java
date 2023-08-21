package one;

import java.util.Scanner;

public class AMinusB {
    public static void aMinusB() {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputs = input.split(" ");

        Integer a = Integer.parseInt(inputs[0]);
        Integer b = Integer.parseInt(inputs[1]);

        System.out.println( a - b );
    }
}
