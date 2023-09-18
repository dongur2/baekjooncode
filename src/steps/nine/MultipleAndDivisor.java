package steps.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MultipleAndDivisor {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(input.nextToken());
            int second = Integer.parseInt(input.nextToken());
            if (first == 0 && second == 0) { // 0 0 입력된 경우 멈춤
                break;
            } else if (second % first == 0) { // 첫번째 수가 두번째 수의 약수일 경우
                System.out.println("factor");
            } else if (first % second == 0) { // 첫번째 수가 두번째 수의 배수일 경우
                System.out.println("multiple");
            } else { // 첫번째 수와 두번째 수가 아무 관계도 아닐 경우
                System.out.println("neither");
            }
        }
    }
}
