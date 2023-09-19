package classes.class1.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hotel {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(input.nextToken());
            int W = Integer.parseInt(input.nextToken());
            int N = Integer.parseInt(input.nextToken());

            int floor = N % H;
            if (floor == 0) {
                floor = H;
            }
            floor = floor * 100;

            int number = (N / H);
            if (number == 0) {
                number = N / H + 1;
            }

            System.out.println(floor+number);
        }
    }
}
