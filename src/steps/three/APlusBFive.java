package steps.three;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class APlusBFive {
    public static void getSum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> sum = new ArrayList<>();

        while (true) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(input.nextToken());
            int B = Integer.parseInt(input.nextToken());

            if (A == B && B == 0) {
                break;
            } else {
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
