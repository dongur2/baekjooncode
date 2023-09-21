package classes.class2.class2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            if (input.equals("0")) { // 0이 입력되면 종료
                break;
            }

            String reverse = "";
            for (int i = input.length() - 1; i >= 0; i--) { // 입력받은 문장 끝에서부터 순차적으로 String에 추가
                reverse += input.charAt(i);
            }

            if (input.equals(reverse)) { // 뒤집은 문자열과 원래 문자열 비교
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
