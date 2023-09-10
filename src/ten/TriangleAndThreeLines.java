package ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TriangleAndThreeLines {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int[] lines = new int[3];

            StringTokenizer input = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(input.nextToken());
            int y = Integer.parseInt(input.nextToken());
            int z = Integer.parseInt(input.nextToken());

            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            lines[0] = x;
            lines[1] = y;
            lines[2] = z;

            int max = 0; // 최대값의 인덱스
            for (int i = 1; i < 3; i++) {
                if (lines[max] < lines[i]) {
                    max = i;
                }
            }

            int sum = 0;
            for (int i = 0; i < 3; i++) {
                if (max == i) {
                    continue;
                }
                sum += lines[i];
            }
            if (sum <= lines[max]) { // 삼각형 조건 필터
                System.out.println("Invalid");
            } else {
                if (x == y && y == z && x == z) {
                    System.out.println("Equilateral");
                } else if (x != y && x != z && y != z) {
                    System.out.println("Scalene");
                } else {
                    System.out.println("Isosceles");
                }
            }

        }
    }
}
