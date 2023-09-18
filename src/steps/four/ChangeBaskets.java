package steps.four;

import java.io.*;
import java.util.StringTokenizer;

public class ChangeBaskets {
    public static void getBasketsNumbers() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        바구니 N개 보유(1번~N번)
//        M번 바구니 역순으로 변경할 것.
//        : 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
//        M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.

//        첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
//        둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다.
//        방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)

        StringTokenizer input = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input.nextToken());
        int M = Integer.parseInt(input.nextToken());

        int baskets[] = new int[N]; // 바구니 목록 생성
        for (int i = 0; i < N; i++) {
            baskets[i] = i+1; // 바구니 순서대로 순서 붙여주기(1~M)
        }

        for (int j = 0; j < M; j++) { // M번만큼 바구니 순서 변경
            StringTokenizer nums = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(nums.nextToken()); // i번에서 시작해서
            int end = Integer.parseInt(nums.nextToken()); // j번까지 변경

            int t = 0;
            int temp[] = new int[end - start + 1]; // 변경 전 순서 번호 임시저장할 배열
            for (int k = start - 1; k < end; k++) { // 배열에 임시저장
                temp[t] = baskets[k];
                t++;
            }

            t=0;
            for (int k = end - 1; k >= start - 1; k--) { // 역순으로 임시저장했던 번호 붙여주기
                baskets[k] = temp[t];
                t++;
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(baskets[i]+" ");
        }

        bw.close();
        br.close();
    }
}
