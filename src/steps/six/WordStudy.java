package steps.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy {
    public static void getAlphabet() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] counts = new int[26]; // 알파벳 순서대로 카운트할 배열
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);

            int index = 0;
            if (w > 'Z') {
                index = w - 32 - 65;
            } else {
                index = w - 65;
            }
            counts[index] ++;
        }

        Integer max = 0; // 최대카운트 인덱스 저장
        for (int i = 1; i < 26; i++) {
            if (counts[i] > counts[max]) {
                max = i;
            }
        }

        int num = 0; // 카운트한 배열에서 최대카운트랑 똑같은 값을 가진 수 개수 세기
        for (int i = 0; i < 26; i++) {
            if (counts[i] == counts[max]) {
                num++;
            }
        }

        if (num > 1) { // 최대카운트 값을 가진 인덱스가 하나일 때만 알파벳 출력
            System.out.print("?");
        } else {
            System.out.print((char)(max+65));
        }

    }
}
