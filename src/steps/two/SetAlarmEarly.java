package steps.two;

import java.util.Scanner;

public class SetAlarmEarly {
    public static void whatTime() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");

        Integer H;
        Integer M;

        // 같은 숫자가 입력되면 배열에 하나만 들어감
        if(inputs.length == 1) {
            H = Integer.parseInt(inputs[0]);
            M = Integer.parseInt(inputs[0]);
        } else {
            H = Integer.parseInt(inputs[0]);
            M = Integer.parseInt(inputs[1]);
        }

        // 분이 45분보다 클 경우
        if( M >= 45 ) {
            System.out.println(H + " " + (M-45));
        } else if ( M < 45 && H > 0) { // 분이 45분보다 작고 시간이 0보다 클 경우
            Integer remain = 45 - M; // 원래 시간에서 되는 만큼 빼고 남은 시간
            Integer realH = H - 1; // 시간 줄여주기
            Integer realM  = 60 - remain; // 남았던 분 빼주기
            System.out.println(realH + " " + realM);
        } else if ( M < 45 && H.equals(0) ) {
            Integer remain = 45 - M; // 원래 시간에서 되는 만큼 빼고 남은 시간
            Integer realH = 23; // 시간 줄여주기
            Integer realM = 60 - remain; // 남았던 분 빼주기
            System.out.println(realH + " " + realM);
        }
    }
}
