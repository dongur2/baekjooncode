package three;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class APlusBSev {
    public static void getSum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        ArrayList<String> sum = new ArrayList<>();

        for(int i=0; i<count; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(input.nextToken());
            int B = Integer.parseInt(input.nextToken());
            sum.add(A+B+"");
        }

        for(int j=0; j<sum.size(); j++) {
            bw.write("Case #"+(j+1)+": "+sum.get(j));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
