package thirteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Cutline {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input.nextToken()); // 응시자 수 N
        int k = Integer.parseInt(input.nextToken()); // 상을 받는 사람 수 k

        StringTokenizer grades = new StringTokenizer(br.readLine()); // 각 학생의 점수 목록
        ArrayList<Integer> grade = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            grade.add(Integer.parseInt(grades.nextToken())); // 배열에 점수 저장
        }

        Collections.sort(grade, Collections.reverseOrder()); // 점수 배열 내림차순 정렬
        System.out.println(grade.get(k - 1)); // 상 받는 사람 중 가장 낮은 점수 출력
    }
}
