package nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactorization {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int i = 2;
        while (i <= N) {
            if (N % i == 0) { // 나누어떨어지는 몫이면
                N = N / i; // N에 새로운 몫 저장
                System.out.println(i);
            } else { // 나누어떨어지지않으면 +1
                i++;
            }

            if (N == 1) { // 더 이상 나눌게 없으면 멈춤
                break;
            }
        }
    }
}
