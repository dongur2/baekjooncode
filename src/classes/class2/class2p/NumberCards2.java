package classes.class2.class2p;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class NumberCards2 {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 가지고 있는 숫자 카드 개수
        StringTokenizer basics = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(br.readLine()); // 존재 확인할 숫자 목록
        StringTokenizer numbers = new StringTokenizer(br.readLine());

        Map<Integer, Integer> counts = new HashMap<>();
        int[] origin = new int[M]; // 출력할 때 원래 입력한 순서대로 뽑아올 원래 숫자 목록
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(numbers.nextToken());
            counts.put(num, 0);
            origin[i] = num;
        }

        for (int i = 0; i < N; i++) { // count
            int comp = Integer.parseInt(basics.nextToken());
            if (counts.containsKey(comp)) {
                counts.put(comp, counts.get(comp) + 1);
            }
        }

        for (int key : origin) { // origin 배열 순서대로 count값 출력
            bw.append(counts.get(key)+" ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
