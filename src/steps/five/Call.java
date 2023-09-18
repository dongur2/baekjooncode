package steps.five;

import java.io.*;

public class Call {
    public static void getSeconds() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String[] nums = {"","","","ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WYXZ"}; // 인덱스가 소요 시간

        int sec = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 3; j < nums.length; j++) {
                String w = word.charAt(i) + "";
                if (nums[j].contains(w)) {
                    sec += j;
                }
            }
        }

        bw.write(sec+"");

        bw.close();
        br.close();
    }
}
