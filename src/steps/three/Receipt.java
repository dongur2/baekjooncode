package steps.three;

import java.util.Scanner;

public class Receipt {
    public static void isitCorrect() {
        Scanner sc = new Scanner(System.in);

        int totalPriceOnReceipt = Integer.parseInt(sc.nextLine());
        int totalCount = Integer.parseInt(sc.nextLine());

        int totalPrice = 0;

        // 물건 종류만큼 반복
        for(int i=0; i<totalCount; i++) {
            String input = sc.nextLine();
            String[] each = input.split(" ");

            int price = Integer.parseInt(each[0]);
            int count = Integer.parseInt(each[1]);

            int tot = price * count;
            totalPrice += tot;
        }

        if(totalPriceOnReceipt == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
