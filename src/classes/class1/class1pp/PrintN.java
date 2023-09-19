package classes.class1.class1pp;

import java.util.Scanner;

public class PrintN {
    public static void getResult() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
