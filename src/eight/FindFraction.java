package eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int sum = 0; // 대각선 줄에서 가장 큰 인덱스
        int i= 0; // 대각선 줄 i번째
        while (true) {
            sum += i;
            if (X <= sum) {
                break;
            }
            i++;
        }

        int top, bottom;
        if (i % 2 == 0) { // 짝수일 경우 sum 감소 => 분자 감소 + 분모 증가
            top = i;
            bottom = 1;
            while (sum > X) {
                top--;
                bottom++;
                if (sum == X) {
                    break;
                }
                sum--;
            }
            System.out.print(top+"/"+bottom);
        } else { // 홀수일 경우 sum 감소 => 분자 증가 + 분모 감소
            top = 1;
            bottom = i;
            while (sum > X) {
                top++;
                bottom--;
                if (sum == X) {
                    break;
                }
                sum--;
            }
            System.out.println(top+"/"+bottom);
        }
    }
}
