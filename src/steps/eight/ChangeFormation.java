package steps.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangeFormation {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        String N = input.nextToken();
        int B = Integer.parseInt(input.nextToken());

        // 10진수로 변환해 출력
        System.out.println(Long.parseLong(N, B));
    }
}
