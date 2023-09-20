package classes.class1.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfNumbers {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String result = (A * B * C) + "";

        int[] counts = new int[10];
        for (int i = 0; i < result.length(); i++) { // 각 인덱스 == 각 인덱스에 해당하는 숫자(0~9)
            counts[Character.getNumericValue(result.charAt(i))]++;
        }

        for (int num : counts) {
            System.out.println(num);
        }

    }
}
