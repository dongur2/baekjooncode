package classes.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //직각삼각형에서 빗변 길이의 제곱은 다른 두 변의 길이의 제곱의 합과 같다
        while (true) {
            StringTokenizer tri = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tri.nextToken());
            int b = Integer.parseInt(tri.nextToken());
            int c = Integer.parseInt(tri.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
