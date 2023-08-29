package five;

import java.io.*;
import java.util.StringTokenizer;

public class Ascii {
    public static void getAsciiCode() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = new StringTokenizer(br.readLine()).nextToken();
        int part = input.charAt(0);

        bw.write(part+"");

        bw.close();
        br.close();
    }
}
