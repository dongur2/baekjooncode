package steps.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClimbingSnail {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(input.nextToken()); // 낮에 올라갈 수 있는 높이
        int B = Integer.parseInt(input.nextToken()); // 밤에 미끄러지는 높이
        int V = Integer.parseInt(input.nextToken()); // 나무 막대 높이

        int days = (V - A) / (A - B) + 1; // 낮에 올라갈 수 있는 높이(첫날)를 뺀 막대 높이 / 하루동안 올라갈 수 있는 높이 = 걸리는 일 + 첫날
        if ((V - A) % (A - B) != 0) { // 나머지가 있다면 하루 더 (낮에 올라갈 수 있는 높이일테니까)
            days++;
        }
        System.out.print(days);
    }
}