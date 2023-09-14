package twelve;

import java.util.Scanner;

public class SugarDelivery {
    public static void getResult() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        while (N>0) {
            if (N >= 3 && N % 5 != 0) { // 3보다 크고, 5로 나누어 떨어지지 않으면 일단 3으로 뺀다.
                N -= 3;
                count++;
            } else if (N % 5 == 0) { // 그 다음에 5로 나누어떨어지면 5로 뺀다.
                N -= 5;
                count++;
            } else if (N % 3 > 0) { // 나머지가 3으로 나누어 떨어지지 않으면 이젠 불가능
                count = 0;
                break;
            }
        }

        if (N > 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }

    }
}
