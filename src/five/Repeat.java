package five;

import java.io.*;
import java.util.StringTokenizer;

public class Repeat {
    public static void makeNew() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
        String results[] = new String[num]; // 새로운 문자열을 저장할 배열

        for (int i = 0; i < num; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());

            int re = Integer.parseInt(input.nextToken()); // 각 문자 반복 횟수
            String words = input.nextToken(); // 원래 문자열

            String result = ""; // 결과 저장할 빈 문자열
            for (int j = 0; j < words.length(); j++) { // 각 문자마다 반복해서 저장
                String temp = (words.charAt(j) + "").repeat(re);
                result += temp;
            }

            results[i] = result;
        }

        for (int i = 0; i < num; i++) {
            bw.write(results[i]);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
