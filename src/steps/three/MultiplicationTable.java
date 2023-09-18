package steps.three;

import java.util.Scanner;

public class MultiplicationTable {
    public static void getMultiplication() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<10; i++) {
            System.out.println(N + " * " + i + " = " + (N*i));
        }
    }
}
