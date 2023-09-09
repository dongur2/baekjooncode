package ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathIsPE {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        System.out.print(4*n);
    }
}
