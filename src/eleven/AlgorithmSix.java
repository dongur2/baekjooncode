package eleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgorithmSix {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long temp = 0;
        long count = 0;
        for (long i = 0; i <= n-2; i++) {
            temp += i;
            count += temp;
        }
        System.out.println(count);
        System.out.println(3);
    }
}
