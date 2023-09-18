package steps.ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeFromRectangle {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(input.nextToken());
        int y = Integer.parseInt(input.nextToken());
        int w = Integer.parseInt(input.nextToken());
        int h = Integer.parseInt(input.nextToken());


        int height, width;

        // Y축 0~현재위치 or 현재위치~Y 더 가까운 점 고르기
        if (Math.abs(h - y) > Math.abs(0 - y)) {
            height = Math.abs(0 - y);
        } else {
            height = Math.abs(h - y);
        }

        // X축 0~현재위치 or 현재위치~X 더 가까운 점 고르기
        if (Math.abs(w - x) > Math.abs(0 - x)) {
            width = Math.abs(0 - x);
        } else {
            width = Math.abs(w - x);
        }

        // X or Y 중 더 가까운 쪽으로 출력
        if (height > width) {
            System.out.println(width);
        } else {
            System.out.println(height);
        }

    }
}
