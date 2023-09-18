package steps.thirteen;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortNumbers2 {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) { // 값 배열에 저장
            nums.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(nums); // 오름차순 정렬

        for (int i = 0; i < N; i++) {
            bw.write(nums.get(i)+"\n");
        }
        bw.close();
        br.close();
    }
}
