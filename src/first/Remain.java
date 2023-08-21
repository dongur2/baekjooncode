package first;

import java.util.Scanner;

public class Remain {
    public static void printRemains() {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");

        Integer A = Integer.parseInt(inputs[0]);
        Integer B = Integer.parseInt(inputs[1]);
        Integer C = Integer.parseInt(inputs[2]);

        System.out.println( (A+B)%C);
        System.out.println( ((A%C) + (B%C))%C );
        System.out.println( (A*B)%C );
        System.out.println( ((A%C) * (B%C))%C );
    }
}
