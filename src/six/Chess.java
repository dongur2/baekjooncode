package six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    public static void getCountForWholeSet() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());

        int[] origin = {1, 1, 2, 2, 2, 8}; // 세트 구성 개수

        // 지금 가지고 있는 개수 저장
        int[] now = new int[6];
        for (int i = 0; i < 6; i++) {
            now[i] = Integer.parseInt(input.nextToken());
        }

        // 비교 계산
        for (int i = 0; i < 6; i++) {
            System.out.print(origin[i] - now[i]+" ");
        }

        br.close();

    }
}
