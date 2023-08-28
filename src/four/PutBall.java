package four;

import java.io.*;
import java.util.StringTokenizer;

public class PutBall {
    public static void getNumberOfBallInBasket() throws IOException {
        // 바구니 N개(1~N번 바구니)와 1~N번 공 보유
        // 가장 처음에 바구니엔 공이 들어있지 않고, 바구니엔 공을 1개만 넣을 수 있다.
        // M번 공을 넣을 건데, 한 번 공을 넣을 때, 공 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적힌 공을 넣음
        // 만약 바구니에 이미 공이 있는 경우, 있던 공을 빼고 새로 공을 넣음.
        // 공을 어떻게 넣을지 주어졌을 때, M번 공을 넣은 이후 각 바구니에 어떤 공이 들어있는지 구하는 프로그램 작성

        // 1. N, M이 주어짐
        // 2. M개의 줄에 걸쳐 공을 넣는 방법: i번~j번 바구니까지 k번 번호가 적힌 공을 넣는다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer NandM = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(NandM.nextToken());
        int M = Integer.parseInt(NandM.nextToken());

        int baskets[] = new int[N]; // 가지고있는 바구니 목록 만들어주기 (처음엔 비어있으므로 모두 0)
        for (int i = 0; i < M; i++) { // M번 공 넣어주기
            StringTokenizer putBalls = new StringTokenizer(br.readLine());
            int startN = Integer.parseInt(putBalls.nextToken());
            int endN = Integer.parseInt(putBalls.nextToken());
            int numOfBalls = Integer.parseInt(putBalls.nextToken());

            for (int j = startN - 1; j < endN; j++) { // 배열은 0부터 시작하고, 바구니는 1부터 시작하니까 맞춰주기
                baskets[j] = numOfBalls; // 공 넣어주기
            }
        }

        for (int k = 0; k < baskets.length; k++) {
            bw.write(baskets[k]+" ");
        }
        bw.close();
        br.close();

    }
}
