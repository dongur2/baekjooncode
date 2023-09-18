package steps.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int row = 0;
        int column = 0;

        int[][] matrix = new int[9][9]; // 빈 행렬 생성
        for (int i = 0; i < 9; i++) { // 행 반복
            StringTokenizer input = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) { // 열 반복
                matrix[i][j] = Integer.parseInt(input.nextToken());

                if (max < matrix[i][j]) { // 최댓값 저장
                    max = matrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println(max);
        System.out.print((row + 1) + " " + (column + 1)); // 배열 인덱스+1 == 실제 인덱스
    }
}
