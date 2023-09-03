package six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YourScoreIs {
    public static void getScore() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] alphaT = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        Double[] scoreT = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        float sum = 0;
        float sumSocre = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            input.nextToken();
            Double score = Double.parseDouble(input.nextToken());
            String alphabet = input.nextToken();

            Integer index = 0;
            for (int j = 0; j < 9; j++) {
                if (alphaT[j].equals(alphabet)) {
                    index = j;
                    break;
                } else if (alphabet.equals("P")) {
                    index = null;
                    break;
                }
            }

            if (index != null) { // P인 과목 걸러주
                sum += score * scoreT[index];
                sumSocre += score;
            }
        }

        System.out.print(sum / sumSocre);
    }
}
