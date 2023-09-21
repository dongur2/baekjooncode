package classes.class2.class2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Josephus0 {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input.nextToken());
        int K = Integer.parseInt(input.nextToken());

        // 각 인덱스값 자리에 인덱스+1 값 저장 (실제로 출력할 자리수)
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(i + 1);
        }


        // 0부터 시작하는 인덱스와 맞춰주기 위해 K-1을 더하면서, 인덱스값 제거하기 전 배열에 저장
        int idx = 0;
        ArrayList<Integer> line = new ArrayList<>();
        while (!arr.isEmpty()) {
            idx += K - 1;
            if (idx >= arr.size()) {
                idx %= arr.size();
            }
            line.add(arr.get(idx));
            arr.remove(idx);
        }

        System.out.print("<");
        for (int i = 0; i < line.size(); i++) {
            if (i == line.size() - 1) {
                System.out.print(line.get(i) + ">");
            } else {
                System.out.print(line.get(i)+", ");
            }
        }

    }
}
