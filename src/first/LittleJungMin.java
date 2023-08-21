package first;

import java.util.Scanner;

public class LittleJungMin {
    public static void jungminPlusThree() {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");

        Long a = Long.parseLong(inputs[0]);
        Long b = Long.parseLong(inputs[1]);
        Long c = Long.parseLong(inputs[2]);

        System.out.println(a + b + c);

    }
}
