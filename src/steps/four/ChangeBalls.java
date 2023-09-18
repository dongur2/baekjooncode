package steps.four;

import java.io.*;
import java.util.StringTokenizer;

public class ChangeBalls {
    public static void getNumbersOfBallsInBasket() throws IOException {
        // N개 바구니 보유(1~N번) + 각 바구니엔 공이 1개씩 들어있고, 처음엔 바구니번호와 같은 번호가 적힌 공이 들어있음.
        // M번 공을 변경: 바구니 2개를 선택한 뒤, 두 바구니 안의 공을 서로 교환

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer NandM = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(NandM.nextToken());
        int M = Integer.parseInt(NandM.nextToken());

        int baskets[] = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i+1; // 각 바구니에 각 번호에 해당하는 공 넣어주기
        }

        for (int j = 0; j < M; j++) { // M번 공 변경
            StringTokenizer nums = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(nums.nextToken()) - 1; // 실제 배열 인덱스와 바구니 번호 맞춰주기
            int b = Integer.parseInt(nums.nextToken()) - 1;

            int temp = baskets[a];
            baskets[a] = baskets[b]; // a바구니에 b바구니에 있던 공 넣어주기
            baskets[b] = temp; // b바구니에 a바구니에 있던 공 넣어주기
        }

        for (int k = 0; k < baskets.length; k++) {
            bw.write(baskets[k]+" ");
        }
        bw.close();
        br.close();
    }
}
