package two;

import java.util.Scanner;

public class PickQuadrant {
    public static void whichIsQuadrant(){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X > 0 && Y > 0) {
            System.out.println(1);
        } else if (X > 0 && Y < 0) {
            System.out.println(4);
        } else if (X < 0 && Y > 0) {
            System.out.println(2);
        } else if (X < 0 && Y < 0) {
            System.out.println(3);
        }
    }
}
