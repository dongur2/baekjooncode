package five;

import java.io.*;

public class FindChar {
    public static void getIndexOfChar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] results = new int[26];
        for (int i = 0; i < 26; i++) { // 먼저 -1로 채워주기
            results[i] = -1;
        }


        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (word.charAt(i) == alphabet[j] && results[j] == -1) { // 처음 등장했을 때만 인덱스 채워주기
                    results[j] = i;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            bw.write(results[i] + " ");
        }

        bw.close();
        br.close();
    }
}
