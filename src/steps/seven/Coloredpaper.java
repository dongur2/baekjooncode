package steps.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coloredpaper {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 흰 도화지
        int[][] background = new int[100][100];

        // 색종이 붙이기
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(input.nextToken());
            int bottom = Integer.parseInt(input.nextToken());

            for (int j = left; j < left + 10; j++) {
                for (int k = bottom; k < bottom + 10; k++) {
                    if (background[j][k] == 0) { // 겹치는 부분은 넓이 빼기
                        background[j][k] += 1;
                    }
                }
            }
        }

        // 색종이 넓이
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += background[i][j];
            }
        }
        System.out.print(sum);
    }
}
