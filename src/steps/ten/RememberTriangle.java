package steps.ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RememberTriangle {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());
        int three = Integer.parseInt(br.readLine());

        int sum = one + two + three;

        if (one == 60 && two == 60 && three == 60) {
            System.out.println("Equilateral");
        } else if (sum == 180 && (one==two || two == three || one == three)) {
            System.out.println("Isosceles");
        } else if (sum == 180 && (one != two && two != three && one != three)) {
            System.out.println("Scalene");
        } else if (sum != 180) {
            System.out.println("Error");
        }
    }
}
