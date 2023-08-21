package one;

import java.util.Scanner;

public class ADivideB {
    public static void aDivideB() {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputs = input.split(" ");

        Double a = Double.parseDouble(inputs[0]);
        Double b = Double.parseDouble(inputs[1]);

        System.out.println( a / b );
    }
}
