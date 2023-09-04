package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerticalReading {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 하나의 단어는 최대 15개의 글자로 구성 -> 열 최대 15, 행 5(고정)
        String[][] matrix = new String[5][15]; // 행렬 생성
        for (int i = 0; i < 5; i++) { // 5줄 입력
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                matrix[i][j] = input.charAt(j)+"";
            }
        }

        // 출력
        for (int j = 0; j < 15; j++) { // 열 고정
            for (int i = 0; i < 5; i++) { // 행부터 반복
                if (matrix[i][j] == null) {
                    System.out.print("");
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
        }
    }
}
