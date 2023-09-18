package steps.eleven;

import java.util.Scanner;

public class AlgorithmThree {
    public static void getResult() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //MenOfPassion(A[], n) {
        //    sum <- 0;
        //    for i <- 1 to n
        //        for j <- 1 to n
        //            sum <- sum + A[i] × A[j]; # 코드1 // n^2번 실행 - 2차식
        //    return sum;
        //}
        System.out.println((long) Math.pow(n, 2));
        System.out.println(2);

    }
}
