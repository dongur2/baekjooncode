package steps.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDivisor {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n < 0) { // -1이 입력되면 종료
                break;
            }

            int sum = 0;
            String nums = "";
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    nums += i+" ";
                }
            }

            if (sum == n) { // 완전수일 경우
                String[] num = nums.split(" ");
                System.out.print(n+" = ");
                for (int i = 0; i < num.length; i++) {
                    if (i == (num.length - 1)) {
                        System.out.println(num[i]);
                    } else {
                        System.out.print(num[i] + " + ");
                    }
                }
            } else { // 완전수가 아닐 경우
                System.out.println(n+" is NOT perfect.");
            }
        }
    }
}
