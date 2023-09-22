package classes.class2.class2p;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class FindNumber {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> Ns = new HashSet<>(); // HashSet: 순서X, 중복 불허
        StringTokenizer input = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Ns.add(Integer.parseInt(input.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        input = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(input.nextToken()); // M 숫자 목록은 저장하지 않고 숫자를 꺼내는 즉시 비교
            if (Ns.contains(num)) {
                bw.append("1\n");
            } else {
                bw.append("0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
