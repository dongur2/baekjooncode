package thirteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RepresentativeValue {
    public static void getResult() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            sum += n;
            nums.add(n);
        }

        Collections.sort(nums); // sort

        System.out.println(sum / 5); // average
        System.out.println(nums.get(2)); // middle

    }
}
