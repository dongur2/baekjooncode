package steps.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangeFormationTwo {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer input = new StringTokenizer(br.readLine());
        Long N = Long.parseLong(input.nextToken());
        int B = Integer.parseInt(input.nextToken());

        String result = Long.toString(N, B).toUpperCase();
        System.out.println(result);
    }
}
