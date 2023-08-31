package six;

import java.util.Scanner;

public class PrintStarsSev {
    public static void printStars() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) { // 공백
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) { // 공백
                System.out.print(" ");
            }
            for (int j = 1; j < N * 2 - i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
