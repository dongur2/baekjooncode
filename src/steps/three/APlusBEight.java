package steps.three;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class APlusBEight {
    public static void getSum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        ArrayList<String> sum = new ArrayList<>();

        for(int i=1; i<=count; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(input.nextToken());
            int B = Integer.parseInt(input.nextToken());
            int tot = A+B;

            sum.add("Case #" + i + ": " + A + " + " + B + " = " + tot);
        }

        for(int j=0; j<sum.size(); j++) {
            bw.write(sum.get(j));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
