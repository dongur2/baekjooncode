package Four;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Max {
    public static void getIndexOfMax() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int now;
        int index;
        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            now = Integer.parseInt(input.nextToken());
            arr.add(now);

            if (max < now) {
                max = now;
            }
        }

        bw.write(max + "");
        bw.newLine();
        bw.write((arr.indexOf(max) + 1) + "");

        bw.close();
        br.close();
    }
}
