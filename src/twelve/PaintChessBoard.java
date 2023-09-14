package twelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PaintChessBoard {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
        StringTokenizer input = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(input.nextToken());
        int N = Integer.parseInt(input.nextToken());

        //둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.
        String[][] states = new String[M][N];
        for (int i = 0; i < M; i++) {
            String state = br.readLine();
            for (int j = 0; j < N; j++) {
                states[i][j] = state.charAt(j)+""; // 배열에 W/B 저장
            }
        }


        // 1. MN크기의 판에서 8*8사각형을 선택하는 모든 경우를 비교해야 한다.
        // 첫 시작 인덱스 저장
        String[] startSpots;
        if (M == 8 && N == 8) { // 처음부터 8*8인 판이 주어질 경우 시작은 0,0으로 고정
            startSpots = new String[1];
            startSpots[0] = "0,0";
        } else { // 8*8 이상 크기로 주어질 경우 시작 인덱스는 여러 개 - 배열에 저장
            startSpots = new String[(M-7)*(N-7)];
            int k = 0;
            for (int i = 0; i <= M - 8; i++) {
                for (int j = 0; j <= N - 8; j++) {
                    startSpots[k] = i+","+j;
                    k++;
                }
            }
        }


        int countOrigin = 0;
        int[] countOrigins = new int[startSpots.length]; // 시작 색깔 고정할 경우 색칠 횟수
        int countChange = 0;
        int[] countChanges = new int[startSpots.length]; // 시작 색깔 변경할 경우 색칠 횟수

        // 2. 시작 인덱스부터 8*8에 해당하는 색깔 상태를 부분적으로 가져와서 색칠해야할 부분 카운트
        for (int i = 0; i < startSpots.length; i++) {
            String[] startIndex = startSpots[i].split(",");
            int startRow = Integer.parseInt(startIndex[0]);
            int startColumn = Integer.parseInt(startIndex[1]);

            countOrigin = 0;
            countChange = 0;
            String start = states[startRow][startColumn];

            // 시작한 색깔 그대로 고정할 경우
            for (int j = startRow; j < startRow + 8; j += 2) {
                for (int l = startColumn; l < startColumn + 8; l += 2) {
                    if (!states[j][l].equals(start)) {
                        countOrigin++;
                    } else {
                        countChange++;
                    }
                }
                for (int l = startColumn + 1; l < startColumn + 8; l += 2) {
                    if (states[j][l].equals(start)) {
                        countOrigin++;
                    } else {
                        countChange++;
                    }
                }
            }
            for (int j = startRow + 1; j < startRow + 8; j += 2) {
                for (int l = startColumn; l < startColumn + 8; l += 2) {
                    if (states[j][l].equals(start)) {
                        countOrigin++;
                    } else {
                        countChange++;
                    }
                }
                for (int l = startColumn + 1; l < startColumn + 8; l += 2) {
                    if (!states[j][l].equals(start)) {
                        countOrigin++;
                    } else {
                        countChange++;
                    }
                }
            }
            countOrigins[i] = countOrigin;
            countChanges[i] = countChange;
        }


        // 비교해서 최솟값 출력
        int minO = countOrigins[0];
        int minC = countChanges[0];

        for (int i = 0; i < countOrigins.length; i++) {
            if (minO > countOrigins[i]) {
                minO = countOrigins[i];
            }
            if (minC > countChanges[i]) {
                minC = countChanges[i];
            }
        }

        if (minO > minC) {
            System.out.println(minC);
        } else {
            System.out.println(minO);
        }


    }
}
