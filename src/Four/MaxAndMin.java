package Four;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MaxAndMin {
    public static void getMaxAndMin() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer input = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(input.nextToken()));
        }

        int min=arr.get(0);
        int max=arr.get(0);

        for (int j = 1; j < arr.size(); j++) {
            if (min > arr.get(j)) {
                min = arr.get(j);
            }
        }
        for (int j = 1; j < arr.size(); j++) {
            if (max < arr.get(j)) {
                max = arr.get(j);
            }
        }

        bw.write(min+" ");
        bw.write(max + "");

        bw.close();
        br.close();

    }
}
