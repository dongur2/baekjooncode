package ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeSticks {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(input.nextToken());
        int b = Integer.parseInt(input.nextToken());
        int c = Integer.parseInt(input.nextToken());


        // 가장 긴 변 <= 나머지 두 변의 합
        int[] lines = new int[3];
        lines[0] = a;
        lines[1] = b;
        lines[2] = c;

        int max = 0;
        for (int i = 1; i < 3; i++) {
            if (lines[max] < lines[i]) {
                max = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            if (max == i) {
                continue;
            }
            sum += lines[i];
        }

        if (sum > lines[max]) { // 두 변의 합이 가장 긴 변보다 클 경우
            System.out.println(a + b + c);
        } else { // 두 변의 합이 가장 긴 변보다 같거나 작을 경우, 가장 긴 변을 두 변의 합보다 1작은 길이로 축소
            max = sum - 1;
            System.out.println(max + sum);
        }
    }
}
