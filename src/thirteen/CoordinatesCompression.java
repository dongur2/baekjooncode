package thirteen;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CoordinatesCompression {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer input = new StringTokenizer(br.readLine());

        int[] original = new int[N]; // 원래 배열
        int[] sorted = new int[N]; // 오룸차순으로 정렬할 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<>(); // 배열대로 순위 매길 Map

        // 배열에 좌표값 저장
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(input.nextToken());
            sorted[i] = original[i];
        }

        // 오름차순 정렬
        Arrays.sort(sorted);

        // Map에서 순위 부여
        int rank = 0;
        for (int num : sorted) { // 정렬한 배열 순회하면서, Map에 들어있지 않은 Key(좌표)라면 Value로 순위 부여하면서 삽입
            if (!rankingMap.containsKey(num)) {
                rankingMap.put(num, rank);
                rank++;
            }
        }

        // 원래 배열 순서대로 순위를 출력
        for (int key : original) {
            bw.write(rankingMap.get(key)+" ");
        }

        bw.close();
        br.close();

    }
}
