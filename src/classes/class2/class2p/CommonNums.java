package classes.class2.class2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CommonNums {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(input.nextToken());
        int b = Integer.parseInt(input.nextToken());

        List<Integer> nums = new ArrayList<>(); // a의 약수를 오름차순으로 저장
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                nums.add(i);
            }
        }

        int max = 0; // 최대공약수
        for (int i : nums) { // a의 약수 중 b와의 공약수를 차례차례 저장 - 오름차순이므로 마지막에 저장되는 수가 가장 크게 되므로, 최대공약수가 된다.
            if (b % i == 0) {
                max = i;
            }
        }

        int min = (a / max) * (b / max) * max; // 최소공배수: 최대공약수 * 최대공약수로 a와 b를 나눈 몫

        System.out.print(max+"\n"+min);
    }
}
