package six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia {
    public static void howMany() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int count = 0;
        for (int i = 0; i < 8; i++) {
            while (input.contains(croatia[i])) { // 알파벳을 포함하는 한 반복
                count++;
                input = input.replaceFirst(croatia[i], ","); // 중간 ,로 구분 (그냥 삭제하면 붙어버려서 또 카운트)
            }
        }

        count = count + input.replace(",", "").length(); // , 빼주고 카운트
        System.out.print(count);
    }
}