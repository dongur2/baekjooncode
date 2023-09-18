package steps.eleven;

import java.util.Scanner;

public class AlgorithmFour {
    public static void getResult() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //MenOfPassion(A[], n) {
        //    sum <- 0;
        //    for i <- 1 to n - 1 // n-1회
        //        for j <- i + 1 to n // (n-1)까지의 합 만큼 반복
        //            sum <- sum + A[i] × A[j];
        //    return sum;
        //}
        int i = n-1;
        long j = 0;
        for (int k = 0; k <= i; k++) {
            j += k;
        }

        System.out.println(j);
        System.out.println(2);

    }
}
