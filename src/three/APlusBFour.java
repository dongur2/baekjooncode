package three;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class APlusBFour {
    public static void getSum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> sum = new ArrayList<>();

        while (true) {
            StringTokenizer input = new StringTokenizer(br.readLine());

            if(input == null || !input.hasMoreTokens()) {
                break;
            } else {
                int A = Integer.parseInt(input.nextToken());
                int B = Integer.parseInt(input.nextToken());
                sum.add(A + B + "");
            }
        }

        for (int i = 0; i < sum.size(); i++) {
            bw.write(sum.get(i));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
