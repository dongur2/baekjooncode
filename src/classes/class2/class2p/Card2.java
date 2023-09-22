package classes.class2.class2p;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Card2 {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue cards = new ArrayDeque();// FIFO(선입선출) Queue
        for (int i = 1; i <= N; i++) {
            cards.add(i);
        }

        while (cards.size() > 1) {
            cards.poll(); // 첫 번째 값 꺼냄
            Object toDown = cards.poll(); // 첫 번째 값 꺼낸 뒤 그 다음 값 꺼냄
            cards.offer(toDown); // 꺼낸 값 가장 뒤로 다시 넣기
        }

        for (Object num : cards) {
            bw.append((int) num+"");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
