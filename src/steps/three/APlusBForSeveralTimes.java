package steps.three;

import java.util.ArrayList;
import java.util.Scanner;

public class APlusBForSeveralTimes {
    public static void getSumTotal() {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine()); // 테스트 케이스의 개수

        int i = 0; // 주어진 테스트 케이스의 개수만큼 셀 카운트
        ArrayList<String> sums = new ArrayList<>(); // 입력받는 한 줄의 합을 저장할 배열

        while (i < T) { // 입력받은 값을 바로바로 숫자로 변환해 합을 구한다음 배열에 String으로 저장
            String input = sc.nextLine();
            String[] inputArray = input.split(" ");
            int A = Integer.parseInt(inputArray[0]);
            int B = Integer.parseInt(inputArray[1]);
            sums.add(A+B+"");
            i++;
        }

        for(int j=0; j<sums.size(); j++) {
            System.out.println(sums.get(j));
        }

    }
}
