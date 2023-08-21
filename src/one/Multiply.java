package one;

import java.util.Scanner;

public class Multiply {
    public static void multiplyThree() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * (b%10));
        System.out.println(a * ((b/10) % 10));
        System.out.println(a * (b/100));
        System.out.println( a * b ) ;

    }
}
