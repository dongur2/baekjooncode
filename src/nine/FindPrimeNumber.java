package nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrimeNumber {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer input = new StringTokenizer(br.readLine());

        int countPrime = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(input.nextToken());
            int count = 0;

            for (int j = 1; j <= num; j++) { // 약수 개수
                if (num % j == 0) {
                    count++;
                }
            }

            if (count == 2) { // 소수면 소수 개수 증가
                countPrime++;
            }
        }

        System.out.println(countPrime);
    }
}
