package Four;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SubmitAssignment {
    public static void whoIsIt() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int students[] = new int[30];
        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken()) - 1;
            students[num] = 1; // 제출한 학생은 인덱스(번호-1)값이 1
        }

        ArrayList<Integer> notSubmit = new ArrayList<>();
        for (int j = 0; j < 30; j++) {
            if (students[j] == 0) { // 미제출한 학생은 인덱스(번호-1)값이 0
                notSubmit.add(j+1); // 미제출한 학생 배열에 번호 추가
            }
        }

        int min = notSubmit.get(0);
        for (int k = 0; k < notSubmit.size(); k++) {
            if (notSubmit.get(k) < min) {
                min = notSubmit.get(k);
            }
        }
        bw.write(min + ""); // 가장 작은 수 출력
        bw.newLine();

        for (int k = 0; k < notSubmit.size(); k++) {
            if (min == notSubmit.get(k)) {
                continue;
            }
            bw.write(notSubmit.get(k)+"");
        }

        bw.close();
        br.close();

    }
}
