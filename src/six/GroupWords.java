package six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWords {
    public static void getWordsCount() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean isGroup = true;
            String word = br.readLine();

            for (int j = 1; j < word.length(); j++) {
                int preF = word.indexOf(word.charAt(j-1));
                int preL = word.lastIndexOf(word.charAt(j-1));

                int nowF = word.indexOf(word.charAt(j));
                int nowL = word.lastIndexOf(word.charAt(j));

                if (preF < nowF && preL > nowL) {
                    isGroup = false;
                    break;
                } else if (preF < nowF && preL < nowL && (preF < preL && preL > nowF)) {
                    isGroup = false;
                    break;
                }
            }

            if (isGroup) {
                count++;
            }

        }
        System.out.print(count);
    }
}
