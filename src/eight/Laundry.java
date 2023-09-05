package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laundry {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] result = new String[T];

        for (int i = 0; i < T; i++) {
            int change = Integer.parseInt(br.readLine());
            int q = change / 25;
            change -= 25 * q;
            int d = change / 10;
            change -= 10 * d;
            int n = change / 5;
            change -= 5 * n;
            int p = change;

            result[i] = q + " " + d + " " + n + " " + p;
        }

        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }
}
