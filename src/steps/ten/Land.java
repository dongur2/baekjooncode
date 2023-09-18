package steps.ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Land {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] xs = new int[N];
        int[] ys = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(input.nextToken());
            int y = Integer.parseInt(input.nextToken());

            xs[i] = x;
            ys[i] = y;
        }

        // 가장 큰 좌표 - 가장 작은 좌표 = 한 변의 길이
        int minX = xs[0];
        int maxX = xs[0];
        int minY = ys[0];
        int maxY = ys[0];
        for (int i = 0; i < N; i++) {
            if (minX > xs[i]) {
                minX = xs[i];
            }
            if (maxX < xs[i]) {
                maxX = xs[i];
            }

            if (minY > ys[i]) {
                minY = ys[i];
            }
            if (maxY < ys[i]) {
                maxY = ys[i];
            }
        }
        System.out.println((maxY - minY) * (maxX - minX));
    }
}
