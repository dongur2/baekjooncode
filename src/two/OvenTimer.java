package two;

import java.util.Scanner;

public class OvenTimer {
    public static void getTimeForDuck() {
        Scanner sc = new Scanner(System.in);
        String startInput = sc.nextLine();
        String[] startL = startInput.split(" ");
        int needM = sc.nextInt();

        int nowH = Integer.parseInt(startL[0]);
        int nowM = Integer.parseInt(startL[1]);

        if( nowM + needM < 60) { // 필요한 분을 더해도 60을 넘지 않는 경우 H 고정
            System.out.println(nowH + " " + (nowM + needM));
        } else if ( (nowM + needM) / 60 > 0 && nowH + ((nowM + needM) / 60) < 24) { // 60분 초과, 더한 시간이 24 미만인 경우
            System.out.println(nowH + ((nowM + needM) / 60) + " " + (nowM + needM) % 60);
        } else if ( (nowM + needM) / 60 > 0 && nowH + ((nowM + needM) / 60) >= 24) { // 60분 초과, 더한 시간이 24 이상인 경우
            System.out.println((nowH + ((nowM + needM) / 60)) % 24 + " " + (nowM + needM) % 60);
        }

    }
}
