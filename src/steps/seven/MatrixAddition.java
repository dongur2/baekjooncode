package steps.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixAddition {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer sizes = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(sizes.nextToken());
        int M = Integer.parseInt(sizes.nextToken());

        int[][] matrix = new int[N][M]; // 빈 행렬 생성
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < N; i++) { // 행 반복
                StringTokenizer input = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) { // 열 반복
                    matrix[i][j] += Integer.parseInt(input.nextToken());
                }
            }
        }

        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
