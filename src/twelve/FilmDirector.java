package twelve;

import java.util.Scanner;

public class FilmDirector {
    public static void getResult() {
        Scanner sc = new Scanner(System.in);

        // 1:666, 2:1666, 3:2666, 4:3666, 5:4666, 6:5666, 7: 6666, 8:6667, ..., 10:10666, 11:11666,...,100:1006666
        int N = sc.nextInt();

        int index = 0;
        for (int i = 665; ; i++) {
            if ((i + "").indexOf("666") > -1) { // 666이 포함돼있으면 카운트
                index++;
                if (index == N) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
