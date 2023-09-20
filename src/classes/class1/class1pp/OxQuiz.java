package classes.class1.class1pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OxQuiz {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String res = br.readLine();

            int sum = 0;
            int count = 0;
            for (int j = 0; j < res.length(); j++) {
                if (res.charAt(j) == 'O') { // O일 경우 count를 센 뒤 합에 더한다
                    count++;
                    sum += count;
                } else { // X일 경우 지금까지 O일 때 더해온 count를 0으로 리셋 (어차피 0이므로 합은 더하지 않는다)
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
