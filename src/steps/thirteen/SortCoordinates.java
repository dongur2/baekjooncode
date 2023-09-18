package steps.thirteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SortCoordinates {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2]; // 2차원 배열
        for (int i = 0; i < N; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(input.nextToken()); // x좌표
            arr[i][1] = Integer.parseInt(input.nextToken()); // y좌표
        }

//       1. Comperator 선언
//        Arrays.sort(arr, new Comparator<int[]>() { // Arrays.sort는 2차원 배열 정렬은 불가능 => Comparator의 compare의 method override -> 새롭게 정렬 정의
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] == o2[0]) {
//                    return o1[1] - o2[1]; // 1번째 값이 같으면 (x좌표) 2번째 값을 비교 (y좌표)
//                } else {
//                    return o1[0] - o2[0];
//                }
//            }
//        });

//        2. 람다식
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
