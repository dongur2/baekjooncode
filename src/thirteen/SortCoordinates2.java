package thirteen;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SortCoordinates2 {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] spots = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            spots[i][0] = Integer.parseInt(input.nextToken()); // x좌표 저장
            spots[i][1] = Integer.parseInt(input.nextToken()); // y좌표 저장
        }

        Arrays.sort(spots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) { // y좌표가 같으면
                    return o1[0] - o2[0]; // x좌표 비교
                } else {
                    return o1[1] - o2[1]; // y좌표가 다를 경우 y좌표 비교한대로 정렬
                }
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(spots[i][0]+" "+spots[i][1]+"\n");
        }

        bw.close();
        br.close();
    }
}
