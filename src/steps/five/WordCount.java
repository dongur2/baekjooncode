package steps.five;

import java.io.*;

public class WordCount {
    public static void getCountOfWords() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        input = input.trim(); // 앞뒤 공백 제거

        if (input.equals("")) {
            bw.write("0");
        } else {
            String words[] = input.split(" "); // 공백 기준으로 나누기
            int count = words.length; // 단어 개수

            bw.write(count+"");
        }

        bw.close();
        br.close();
    }
}
