package five;

import java.io.*;
import java.util.StringTokenizer;

public class Strings {
    public static void getFirstAndLast() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        String chars[] = new String[num]; // 결과 저장할 배열

        for (int i = 0; i < num; i++) {
            String input = new StringTokenizer(br.readLine()).nextToken();
            int length = input.length();
            String result = (input.charAt(0)+"") + (input.charAt(length-1)+"");
            chars[i] = result;
        }

        for (int j = 0; j < num; j++) {
            bw.write(chars[j] + "\n");
        }

        bw.close();
        br.close();
    }
}
