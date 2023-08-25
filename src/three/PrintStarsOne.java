package three;

import java.io.*;

public class PrintStarsOne {
    public static void printStars() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lines = Integer.parseInt(br.readLine());

        for(int i=0; i<lines; i++) {
            for(int j=0; j<=i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
