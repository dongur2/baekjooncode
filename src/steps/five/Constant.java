package steps.five;

import java.io.*;
import java.util.StringTokenizer;

public class Constant {
    public static void getAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer input = new StringTokenizer(br.readLine());
        String oA = input.nextToken();
        String oB = input.nextToken();

        String A = "";
        String B = "";
        for (int i = 2; i >= 0; i--) {
            A += oA.charAt(i)+"";
            B += oB.charAt(i)+"";
        }

        if (Integer.parseInt(A) > Integer.parseInt(B)) {
            bw.write(A);
        } else {
            bw.write(B);
        }

        bw.close();
        br.close();
    }
}
