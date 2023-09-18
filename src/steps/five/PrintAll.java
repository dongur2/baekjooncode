package steps.five;

import java.io.*;

public class PrintAll {
    public static void printSame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input=br.readLine()) != null) {
            System.out.println(input);
        }
        br.close();
    }
}
