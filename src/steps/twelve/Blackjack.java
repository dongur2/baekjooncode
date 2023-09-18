package steps.twelve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Blackjack {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer nums = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(nums.nextToken()); // 카드의 개수
        int M = Integer.parseInt(nums.nextToken()); // 3장의 카드의 합이 넘지 않으면서 가까워야 할 M

        // 카드 넘버 저장
        ArrayList<Integer> cards = new ArrayList<>();
        StringTokenizer card = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(card.nextToken()));
        }

        // 카드 3개 합 저장 - M 이하일 경우만
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0;i < N; i++) {
            for (int j = i + 1;j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (cards.get(i) + cards.get(j) + cards.get(k) <= M) {
                        results.add(cards.get(i) + cards.get(j) + cards.get(k));
                    }
                }
            }
        }

        // 저장한 합 내림차순 정렬 후 가장 첫째 값(가장 큰 값) 출력
        Collections.sort(results, Collections.reverseOrder());
        System.out.println(results.get(0));
    }
}
