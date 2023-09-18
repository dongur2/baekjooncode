package steps.three;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FastAPlusB {
    public static void printAPlusB() throws IOException { // BufferedReader를 사용할 땐 반드시 IOException 예외처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언해주고
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 값 받아주기
        int count = Integer.parseInt(br.readLine());
        ArrayList<String> sums = new ArrayList<String>(); // 출력할 합계 저장할 배열

        // 개수만큼 반복
        for(int i=0; i<count; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            Integer A = Integer.parseInt(input.nextToken());
            Integer B = Integer.parseInt(input.nextToken());

            sums.add(A+B+"");
        }

        // 출력
        for(int j=0; j<sums.size(); j++) {
            bw.write(sums.get(j));
            bw.newLine();
        }

     //   bw.flush();
        bw.close();
        br.close();

    }
}
