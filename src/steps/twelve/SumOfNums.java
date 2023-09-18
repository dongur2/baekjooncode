package steps.twelve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumOfNums {
    public static void getResult() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N이 분해합 결과로 나오는 수가 생성자 -- 그 중 가장 작은 수 출력

        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            // 각 자리 숫자 저장
           int[] nums = new int[7];
            for (int j = 0; j < (i + "").length(); j++) {
                nums[j] = Character.getNumericValue((i+"").charAt(j));
            }

            // 해당 숫자 + 각 자리 숫자의 합
            int sum = i;
            for (int j = 0; j < (i + "").length(); j++) {
                sum += nums[j];
            }

            // 분해합이 N과 같으면 해당 숫자를 저장
            if (sum == N) {
                results.add(i);
            }
        }

        if (results.size() == 0) { // 생성자가 없는 경우 0 출력
            System.out.println(0);
        } else {
            Collections.sort(results); // 오름차순 정렬
            System.out.println(results.get(0)); // 가장 작은 생성자 출력
        }
    }
}
