package classes.class2.class2p;

import java.io.*;

public class Parenthesis {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            while (input.contains("()")) { // 문자열(String)에는 ()
                input = input.replaceAll("\\(\\)", "").trim(); // regex(char)에는 \\(\\)
            }

            if (!input.isEmpty()) {
                bw.append("NO\n");
            } else {
                bw.append("YES\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
