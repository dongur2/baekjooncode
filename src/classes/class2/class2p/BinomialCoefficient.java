package classes.class2.class2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialCoefficient {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input.nextToken());
        int K = Integer.parseInt(input.nextToken());

        // 이항 계수: N! / K!(N-K)! 를 만족

        int top = 1;
        for (int i = 1; i <= N; i++) {
            top *= i;
        }

        int botL = 1;
        int botR = 1;
        for (int i = 1; i <= K; i++) {
            botL *= i;
        }
        for (int i = 1; i <= (N - K); i++) {
            botR *= i;
        }

        System.out.println(top / (botL * botR));
    }
}
