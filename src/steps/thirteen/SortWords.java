package steps.thirteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortWords {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine(); // 배열에 단어 저장
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int res = 0;

                if (o1.length() == o2.length()) { // 길이가 같을 경우
                    int i = 0;
                    while (i < o1.length()) { // 단어 안 글자 차례차례 사전 순으로 비교
                        res = Character.getNumericValue(o1.charAt(i)) - Character.getNumericValue(o2.charAt(i));

                        if (res != 0) {  // 사전 순이 다를 경우 정렬
                            break;
                        } else { // 사전 순이 같을 경우 다음 글자 비교하도록 i++
                            i++;
                        }
                    }

                } else { // 길이가 다를 경우 길이로 오름차순 정렬
                    res =  o1.length() - o2.length();
                }
                return res;
            }
        });

        String pre;
        for (int i = 0; i < N; i++) {
            if (i > 0) {
                pre = words[i - 1];
                if (!pre.equals(words[i])) { // 이전 단어와 다른 단어일 때만 출력 = 중복 단어는 출력하지 않음
                    System.out.println(words[i]);
                }
            } else {
                System.out.println(words[i]);
            }
        }
    }
}
