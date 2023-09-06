package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 1;
        int i = 0;

        while (true) {
            sum += 6 * i;
            if (N <= sum) {
                break;
            }
            i++;
        }
        System.out.print(i+1);
    }
}
