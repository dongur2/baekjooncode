package twelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MathIsOnlineClass {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(input.nextToken());
        int b = Integer.parseInt(input.nextToken());
        int c = Integer.parseInt(input.nextToken());
        int d = Integer.parseInt(input.nextToken());
        int e = Integer.parseInt(input.nextToken());
        int f = Integer.parseInt(input.nextToken());

        // ax + by = c
        // dx + ey = f

        // -999 <= x,y <= 999
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
