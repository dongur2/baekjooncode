package steps.two;

import java.util.Scanner;

public class ThreeDices {
    public static void getReward() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputS = input.split(" ");

        int one = Integer.parseInt(inputS[0]);
        int two = Integer.parseInt(inputS[1]);
        int three = Integer.parseInt(inputS[2]);

        if( one == two && two == three) { // 같은 눈이 3개인 경우
            System.out.println( 10000+(one*1000) );
        } else if ( one == two || two == three || one == three ) { // 같은 눈이 2개만 나온 경우
            if( one == two ) {
                System.out.println( 1000 + (one * 100) );
            } else if ( two == three ) {
                System.out.println( 1000 + (two * 100) );
            } else if ( one == three ) {
                System.out.println( 1000 + (one * 100) );
            }
        } else if ( one != two && two != three && one != three ) { // 모두 다른 경우
            if( one >= two && one >= three ) {
                System.out.println( one * 100 );
            } else if ( two >= one && two >= three ) {
                System.out.println( two * 100 );
            } else if ( three >= one && three >= two ) {
                System.out.println( three * 100 );
            }
        }
    }
}
