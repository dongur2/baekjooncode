package thirteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {
    public static void getResult() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nums.add(sc.nextInt());
        }

        Collections.sort(nums); // 오름차순 정렬
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

    }
}
