package Four;

import java.io.*;
import java.util.StringTokenizer;

public class Counting {
    public static void getCounting() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer input = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i=0; i<N; i++) {
            int value = Integer.parseInt(input.nextToken());
            if( v == value ) count++;
        }

        bw.write(count+"");
        bw.close();
        br.close();
    }
}
