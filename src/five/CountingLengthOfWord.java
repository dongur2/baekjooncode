package five;

import java.io.*;
import java.util.StringTokenizer;

public class CountingLengthOfWord {
    public static void getLength() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = new StringTokenizer(br.readLine()).nextToken();

        bw.write(word.length() + "");

        bw.close();
        br.close();
    }
}
