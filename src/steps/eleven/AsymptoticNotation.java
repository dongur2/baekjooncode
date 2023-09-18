package steps.eleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AsymptoticNotation {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(input.nextToken());
        int a0 = Integer.parseInt(input.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        int fn = (a1*n0) + a0;
        int gn = n0;

        if (fn <= c * gn && c >= a1) { // a0이 음수일 때를 고려하면, c는 최소 a1을 넘겨야 한다.
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
