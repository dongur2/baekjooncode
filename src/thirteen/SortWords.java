package thirteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortWords {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
        //길이가 짧은 것부터
        //길이가 같으면 사전 순으로
        //단, 중복된 단어는 하나만 남기고 제거해야 한다.

        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[1] = br.readLine();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int res = 0;

                if (o1.length() == o2.length()) {
                    int i = 0;
                    while (i < o1.length()) {
                        res = Character.getNumericValue(o1.charAt(i)) - Character.getNumericValue(o2.charAt(i));

                        if (res != 0) {
                            break;
                        } else {
                            i++;
                        }
                    }

                } else {
                    res =  o1.length() - o2.length();
                }
                return res;
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(words[i]);
        }
    }
}
