package steps.ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourthSpot {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] xs = new int[3]; // x점 저장
        int[] ys = new int[3]; // y점 저장
        for (int i = 0; i < 3; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(input.nextToken());
            int y = Integer.parseInt(input.nextToken());

            xs[i] = x;
            ys[i] = y;
        }

        // 최종 결과
        int finalX = 0;
        int finalY = 0;

        for (int i = 0; i < 3; i++) {
            int x = xs[i];
            int y = ys[i];
            int countX = 0;
            int countY = 0;

            // 같은 값이 두 번 존재하면 제외 (1번 나온 값이 최종)
            for (int j = 0; j < 3; j++) {
                if (xs[i] == xs[j]) {
                    countX++;
                }
                if (ys[i] == ys[j]) {
                    countY++;
                }
            }

            if (countX == 1) {
                finalX = x;
            }
            if (countY == 1) {
                finalY = y;
            }
        }

        System.out.println(finalX+" "+finalY);
    }
}
