package steps.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenterAlgorithm {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.print((int) Math.pow((int) Math.pow(2, N) + 1, 2));
    }
}
