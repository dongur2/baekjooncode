package classes.class1.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hotel {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(input.nextToken());
            int W = Integer.parseInt(input.nextToken());
            int N = Integer.parseInt(input.nextToken());

            int floor;
            if (N % H == 0) { // N이 H의 배수일 경우 나머지는 0이 되지만, 층수는 H층이어야 하므로 따로 H로 지정
                floor = H * 100;
            } else {
                floor = (N % H) * 100;
            }

            int number;
            if (N % H == 0) { // N이 H의 배수일 경우 N/H==1이 되므로, 1+1이 되면 식이 틀리게 된다. 그러므로 따로 지정
                number = N / H;
            } else {
                number = (N / H) + 1;
            }

            System.out.println(floor+number);
        }
    }
}
