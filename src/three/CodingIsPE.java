package three;

import java.util.Scanner;

public class CodingIsPE {
    public static void whatIsNameOfByte() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String plusLong = ""; // 앞에 더해줄 long 문자열이 개수대로 들어갈 string
        String name = "long int"; // 기본값(4)

        int plus = N/4;
        for(int i=1; i<plus; i++) {
            plusLong += "long ";
        }
        System.out.println(plusLong + name);
    }

}
