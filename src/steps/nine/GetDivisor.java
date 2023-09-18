package steps.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GetDivisor {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input.nextToken());
        int K = Integer.parseInt(input.nextToken());

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    System.out.println(i);
                    break;
                }
            }
        }
        if (count < K) {
            System.out.println("0");
        }
    }
}
