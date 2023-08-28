package four;

import java.io.*;
import java.util.StringTokenizer;

public class Remains {
    public static void getCountsOfRemain() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[10]; // 10개 수를 입력받은 뒤 나머지를 저장할 배열
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
            arr[i] = num % 42; // 각 자리에 나머지 저장
        }

        for (int i = 0; i < 10; i++) {
            int cre = arr[i]; // 비교할 기준 수
            for (int j = i + 1; j < 10; j++) {
                if (cre == arr[j]) { // 중복되는 수가 있으면
                    arr[j] = -1; // 음수 처리
                }
            }
        }

        // 인덱스 값이 -1이 아닌 수는, 중복이 아닌 값이 되므로, 조건에 맞는 수 개수를 세주기
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > -1) {
                count ++;
            }
        }

        bw.write(count+"");
        bw.close();
        br.close();
    }
}
