package classes.class1.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Verification {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지
        StringTokenizer input = new StringTokenizer(br.readLine());

        int sum = 0;
        sum += Math.pow(Integer.parseInt(input.nextToken()), 2);
        sum += Math.pow(Integer.parseInt(input.nextToken()), 2);
        sum += Math.pow(Integer.parseInt(input.nextToken()), 2);
        sum += Math.pow(Integer.parseInt(input.nextToken()), 2);
        sum += Math.pow(Integer.parseInt(input.nextToken()), 2);

        System.out.println(sum%10);
    }
}
