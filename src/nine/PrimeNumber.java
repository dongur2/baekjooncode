package nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;
        for (int i = M; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) { // M이상 N이하 자연수 1부터 해당숫자까지 나누기
                if (i % j == 0) { // 나누어떨어지는 수 카운트
                    count++;
                }
            }
            if (count == 2) { // 소수(나누어떨어지는 수가 2개)라면 더하고 min 설정
                sum += i;
                if (min > i || min == 0) {
                    min = i;
                }
            }
        }

        if (sum == 0) { // 소수가 존재하지 않으면 -1만 출력
            System.out.print(-1);
        } else { // 소수가 존재하면 합과 최소값 출력
            System.out.println(sum);
            System.out.print(min);
        }
    }
}
