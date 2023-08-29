package five;

import java.io.*;
import java.util.StringTokenizer;

public class CharAndString {
    public static void getCharForStringIndex() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = new StringTokenizer(br.readLine()).nextToken();
        int index = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()) - 1; // 배열과 실제 인덱스 맞춰주기

        bw.write(word.charAt(index) + "");

        bw.close();
        br.close();

    }
}
