package thirteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortInside {
    public static void getResult() {
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();

        // 각 자리 숫자 배열에 저장
        String[] Ns = new String[N.length()];
        for (int i = 0; i < N.length(); i++) {
            Ns[i] = N.substring(i, i + 1);
        }

        Arrays.sort(Ns, Collections.reverseOrder()); // 내림차순 정렬

        // 출력
        for (int i = 0; i < Ns.length; i++) {
            System.out.print(Ns[i]);
        }
    }
}
